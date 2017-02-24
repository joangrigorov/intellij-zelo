package org.zelo.intellij;

import com.intellij.lang.Language;

public class ZeloLanguage extends Language {
    public static final ZeloLanguage INSTANCE = new ZeloLanguage();

    private ZeloLanguage() {
        super("Zelo");
    }
}
