package ru.avalon.javapp.devj110.files;

public class MultimediaFile extends File{
    private String descr;
    private Duration duration;

    public MultimediaFile(String name, long size, String format, String descr, Duration duration) {
        super(name, size, format);
        setDescr(descr);
        setDuration(duration);
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        if (descr == null)
            throw new IllegalArgumentException("¬ведите описание");
        this.descr = descr;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        if (duration == null)
            throw new IllegalArgumentException("”кажите длительность медиафайла");
        this.duration = duration;
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + getDescr() + ", " + getDuration().durationString();
    }
}
