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
        if (dimension == null)
            throw new IllegalArgumentException("”кажите размер изображени€");
        this.dimension = dimension;
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + dimension.getDimension();
    }
}
