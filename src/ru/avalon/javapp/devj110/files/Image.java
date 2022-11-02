package ru.avalon.javapp.devj110.files;

public class Image extends File {
    private String dimension;//оформить в отдельный класс

    public Image(String name, long size, String format, String dimension) {
        super(name, size, format);
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
        return getFormat() + ", " + getDimension();
    }
}
