package com;

import java.io.File;
import java.io.FileFilter;

public class FileFilterBySufix implements FileFilter{
    private String suffix;

    public FileFilterBySufix(String suffix) {
        super();
        this.suffix=suffix;

    }

    @Override
    public boolean accept(File pathname) {
        return pathname.getName().endsWith(suffix);
    }
}
