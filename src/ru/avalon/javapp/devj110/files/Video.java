package ru.avalon.javapp.devj110.files;

public class Video extends MultimediaFile {

    private Dimension dimension;

    public Video(String name, long size, String format, String descr, Duration duration, Dimension dimension) {
        super(name, size, format, descr, duration);
        setDimension(dimension);
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        if (dimension == null)
            throw new IllegalArgumentException("Укажите размер кадра");
        this.dimension = dimension;
    }

    @Override
    String getDetails() {
        return super.getDetails() + ", " + dimension.getDimension();
    }
}
