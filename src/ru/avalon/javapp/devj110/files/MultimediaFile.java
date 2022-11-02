package ru.avalon.javapp.devj110.files;

public abstract class MultimediaFile extends File{
    private String descr;
    private Duration duration;//оформить в отдельный класс

    public MultimediaFile(String name, long size, String format, String descr, Duration duration) {
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

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
