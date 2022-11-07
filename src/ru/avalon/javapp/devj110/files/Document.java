package ru.avalon.javapp.devj110.files;

public class Document extends File {
    private int pages;

    public Document(String name, long size, String format, int pages) {
        super(name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        if (pages < 0)
            throw new IllegalArgumentException("Укажите корректное число страниц");
        this.pages = pages;
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + getPages() + " pages";
    }
}
