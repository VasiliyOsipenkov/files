package ru.avalon.javapp.devj110.files;

public class Docs extends AbstractFile {
    private int pages;

    public Docs(String name, int size, String format, int pages) {
        super(name, size, format);
        setPages(pages);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    String Details() {
        return getFormat() + ", " + getPages() + " pages";
    }
}
