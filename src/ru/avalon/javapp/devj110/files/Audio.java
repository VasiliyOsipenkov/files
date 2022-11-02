package ru.avalon.javapp.devj110.files;

public class Audio extends MultimediaFile {

    public Audio(String name, long size, String format, String info, String duration) {
        super(name, size, format, info, duration);
    }

    @Override
    String getDetails() {
        return getFormat() + ", " + getDescr() + ", " + getDuration();
    }
}
