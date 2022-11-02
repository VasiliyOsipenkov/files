package ru.avalon.javapp.devj110.files;

public class Video extends MultimediaFile {

    private String dimension;

    public Video(String name, long size, String format, String info, String duration, String dimension) {
        super(name, size, format, info, duration);
        setDimension(dimension);
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension;
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + getDescr() + ", " + getDuration() + ", " + getDimension();
    }
}
