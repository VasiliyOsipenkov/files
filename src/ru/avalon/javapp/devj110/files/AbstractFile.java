package ru.avalon.javapp.devj110.files;

public abstract class AbstractFile {
    private String name;
    private int size;
    private String format;

    public AbstractFile(String name, int size, String format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    abstract String Details();

    public static void printAll(AbstractFile [] files) {
        System.out.println("File name; Size; Details");

        for (AbstractFile file : files) {
            System.out.println(file.getName() + ", " + file.getSize() + ", " + file.Details());
        }

    }
}
