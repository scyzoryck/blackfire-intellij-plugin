package com.github.scyzoryck.blackfire.language;

import com.intellij.lang.Language;

public class BlackfireScenarioLanguage extends Language {

    public static final BlackfireScenarioLanguage INSTANCE = new BlackfireScenarioLanguage();

    protected BlackfireScenarioLanguage() {
        super("BlackfireScenario");
    }
}
