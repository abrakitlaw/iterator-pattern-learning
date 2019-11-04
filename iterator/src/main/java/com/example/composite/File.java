package com.example.composite;

/**
 * @author Abraham Ginting (abraham.ginting@dana.id)
 * @version File, v 0.1 2019-11-04 20:08 by Abraham Ginting
 */
public class File implements AbstractFile {

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void ls() {
        System.out.println(CompositeDemo.compositeBuilder + name);
    }
}
