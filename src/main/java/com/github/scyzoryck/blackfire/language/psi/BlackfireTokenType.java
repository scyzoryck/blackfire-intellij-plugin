package com.github.scyzoryck.blackfire.language.psi;

import com.github.scyzoryck.blackfire.language.BlackfireScenarioLanguage;
import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

public class BlackfireTokenType extends IElementType {
    public BlackfireTokenType(@NotNull @NonNls String debugName) {
        super(debugName, BlackfireScenarioLanguage.INSTANCE);
    }

    @Override
    public String toString() {
        return "BlackfireTokenType." + super.toString();
    }

}
