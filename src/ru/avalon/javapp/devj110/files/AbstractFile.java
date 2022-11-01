package ru.avalon.javapp.devj110.files;

public abstract class AbstractFile {
    private String name;
    private int size;

    public AbstractFile(String name, int size) {
        setName(name);
        setSize(size);
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(int size) {
        this.size = size;
    }

    abstract String Details();

    public static void printAll(String name, int size, String details) {
        System.out.println(name + ", " + size + ", " + details);
    }
}
