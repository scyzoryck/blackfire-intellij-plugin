// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;
import com.github.scyzoryck.blackfire.language.psi.BlackfireTokenType;

public class SimpleVisitor extends PsiElementVisitor {

  public void visitProperty(@NotNull SimpleProperty o) {
    visitBlackfireTokenType(o);
  }

  public void visitBlackfireTokenType(@NotNull BlackfireTokenType o) {
    visitElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
