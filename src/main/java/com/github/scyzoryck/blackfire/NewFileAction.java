package com.github.scyzoryck.blackfire;

import com.intellij.ide.IdeView;
import com.intellij.openapi.actionSystem.*;
import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.fileTypes.UnknownFileType;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import com.intellij.psi.PsiDirectory;
import com.intellij.psi.PsiFile;
import com.intellij.psi.PsiFileFactory;
import com.intellij.psi.codeStyle.CodeStyleManager;
import org.apache.commons.lang.StringUtils;
import org.jetbrains.annotations.NotNull;

public class NewFileAction extends AnAction {
    @Override
    public void actionPerformed(@NotNull AnActionEvent event) {
        final Project project = event.getData(PlatformDataKeys.PROJECT);
        if(project == null){
            return;
        }

        String fileName = Messages.showInputDialog(project, "File name (without extension)", "Create Scenario", BlackfireIcons.LOGO);
        if(fileName == null || StringUtils.isBlank(fileName)) {
            return;
        }

        DataContext dataContext = event.getDataContext();
        IdeView view = LangDataKeys.IDE_VIEW.getData(dataContext);
        if (view == null) {
            return;
        }

        PsiDirectory[] directories = view.getDirectories();
        if(directories.length == 0) {
            return;
        }

        final PsiDirectory initialBaseDir = directories[0];
        if (initialBaseDir == null) {
            return;
        }

        if(initialBaseDir.findFile(fileName) != null) {
            Messages.showInfoMessage("File exists", "Error");
            return;
        }

        final PsiFileFactory factory = PsiFileFactory.getInstance(project);
        String content = "";

        final PsiFile file = factory.createFileFromText(fileName + ".bkf", UnknownFileType.INSTANCE, content);

        ApplicationManager.getApplication().runWriteAction(() -> {
            CodeStyleManager.getInstance(project).reformat(file);
            initialBaseDir.add(file);
        });

        PsiFile psiFile = initialBaseDir.findFile(fileName);
        if(psiFile != null) {
            view.selectElement(psiFile);
        }
    }
}