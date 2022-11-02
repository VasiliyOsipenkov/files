package ru.avalon.javapp.devj110.files;

public class Audio extends Multimedia {

    public Audio(String name, int size, String format, String info, String duration) {
        super(name, size, format, info, duration);
    }

    @Override
    String Details() {
        return getFormat() + ", " + getInfo() + ", " + getDuration();
    }
}
