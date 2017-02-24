package org.zelo.intellij;

import com.intellij.lang.Language;
import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class ZeloFileType extends LanguageFileType {
    public static final String FILE_EXTENSION = "дз";
    public static final ZeloFileType INSTANCE = new ZeloFileType();

    protected ZeloFileType() {
        super(ZeloLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "Zelo source file";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Zelo source file";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return FILE_EXTENSION;
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return Icons.FILE_ICON;
    }
}
