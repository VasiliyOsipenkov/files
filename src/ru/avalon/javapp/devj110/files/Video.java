package ru.avalon.javapp.devj110.files;

public class Video extends Multimedia {

    private String videoSize;

    public Video(String name, int size, String format, String info, String duration, String videoSize) {
        super(name, size, format, info, duration);
        setVideoSize(videoSize);
    }

    public String getVideoSize() {
        return videoSize;
    }

    public void setVideoSize(String videoSize) {
        this.videoSize = videoSize;
    }

    @Override
    String Details() {
        return getFormat() + ", " + getInfo() + ", " + getDuration() + ", " + getVideoSize();
    }
}
