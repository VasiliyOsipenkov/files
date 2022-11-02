package ru.avalon.javapp.devj110.files;

public abstract class Multimedia extends AbstractFile{
    private String info;
    private String duration;

    public Multimedia(String name, int size, String format, String info, String duration) {
        super(name, size, format);
        setInfo(info);
        setDuration(duration);
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
