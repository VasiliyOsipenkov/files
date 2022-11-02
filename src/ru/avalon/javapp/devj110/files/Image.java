package ru.avalon.javapp.devj110.files;

public class Image extends File {
    private Dimension dimension;//оформить в отдельный класс

    public Image(String name, long size, String format, Dimension dimension) {
        super(name, size, format);
        setDimension(dimension);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + dimension.getDimension();
    }
}
