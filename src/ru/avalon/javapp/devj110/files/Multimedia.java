package ru.avalon.javapp.devj110.files;

import java.util.Date;

public abstract class Multimedia extends AbstractFile{
    private String type;
    private String info;
    private String duration;

    public Multimedia(String name, int size, String type, String info, String duration) {
        super(name, size);
        this.type = type;
        this.info = info;
        this.duration = duration;
    }
}
