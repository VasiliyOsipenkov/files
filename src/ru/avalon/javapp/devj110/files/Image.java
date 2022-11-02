package ru.avalon.javapp.devj110.files;

public class Image extends AbstractFile {
    private String imageSize;

    public Image(String name, int size, String format, String imageSize) {
        super(name, size, format);
        setImageSize(imageSize);
    }

    public String getImageSize() {
        return imageSize;
    }

    public void setImageSize(String imageSize) {
        this.imageSize = imageSize;
    }

    @Override
    String Details() {
        return getFormat() + ", " + getImageSize();
    }
}
