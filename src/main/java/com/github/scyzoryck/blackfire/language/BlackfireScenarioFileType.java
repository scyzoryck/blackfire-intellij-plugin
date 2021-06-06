package com.github.scyzoryck.blackfire.language;

import com.github.scyzoryck.blackfire.BlackfireIcons;
import com.intellij.openapi.fileTypes.LanguageFileType;
import com.intellij.openapi.util.NlsContexts;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class BlackfireScenarioFileType extends LanguageFileType {

    public static final BlackfireScenarioFileType INSTANCE = new BlackfireScenarioFileType();

    private BlackfireScenarioFileType() {
        super(BlackfireScenarioLanguage.INSTANCE);
    }

    @Override
    public @NotNull String getName() {
        return "bkf";
    }

    @Override
    public @NotNull @NlsContexts.Label String getDescription() {
        return "Blackfire Scenario";
    }

    @Override
    public @NotNull String getDefaultExtension() {
        return "bkf";
    }

    @Override
    public @Nullable Icon getIcon() {
        return BlackfireIcons.LOGO;
    }
}
