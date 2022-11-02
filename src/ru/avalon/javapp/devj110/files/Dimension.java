package ru.avalon.javapp.devj110.files;

public class Dimension {
    int width;
    int height;

    public Dimension(String dimension) {
        stringToDimension(dimension);
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width > 0)
            this.width = width;
        else
            throw new IllegalArgumentException("Ўирина изображени€ не может быть меньше 1");
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        if (height > 0)
            this.height = height;
        else
            throw new IllegalArgumentException("¬ысота изображени€ не может быть меньше 1");
    }

    public String getDimension() {
        return width + "x" + height;
    }

    private void stringToDimension(String dimension) {
        String[] var = dimension.split("x", 2);
        setWidth(Integer.parseInt(var[0]));
        setHeight(Integer.parseInt(var[1]));
    }

}
