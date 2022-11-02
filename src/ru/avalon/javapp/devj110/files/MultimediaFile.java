package ru.avalon.javapp.devj110.files;

public abstract class MultimediaFile extends File{
    private String descr;
    private String duration;//оформить в отдельный класс

    public MultimediaFile(String name, long size, String format, String descr, String duration) {
        super(name, size, format);
        setDescr(descr);
        setDuration(duration);
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
