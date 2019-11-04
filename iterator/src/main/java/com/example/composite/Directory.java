package com.example.composite;

import java.util.ArrayList;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version Directory, v 0.1 2019-11-04 20:09 by Abraham Ginting
 */
public class Directory implements AbstractFile {

    private String name;

    private ArrayList includedFiles = new ArrayList();

    public Directory(String name) {
        this.name = name;
    }

    public void add(Object object) {
        includedFiles.add(object);
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
        CompositeDemo.compositeBuilder.append(" ");
        for (Object includedFile : includedFiles) {
            // Leverage the "Lowest common denominator"
            AbstractFile obj = (AbstractFile) includedFile;
            obj.ls();
        }
        CompositeDemo.compositeBuilder.setLength(CompositeDemo.compositeBuilder.length());
    }
}
