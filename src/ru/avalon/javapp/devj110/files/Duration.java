package ru.avalon.javapp.devj110.files;

public class Duration {
    private int hours;
    private int minutes;
    private int seconds;

    public Duration(String duration) {
        stringToTime(duration);
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours !=0)
        this.hours = hours;
        else
            throw new IllegalArgumentException("Длительность не может быть отрицательным значением");
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60)
            this.minutes = minutes;
        else if (minutes == 60) {
            ++hours;
            this.minutes = 0;
        }
        else if (minutes < 0 || minutes > 60)
            throw new IllegalArgumentException("Некорректно указаны минуты");

    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60)
            this.seconds = seconds;
        else if (seconds == 60) {
            ++minutes;
            this.seconds = 0;
        }
        else if (seconds < 0 || seconds > 60)
            throw new IllegalArgumentException("Некорректно указаны секунды");
    }

    public String durationString() {
        int h = 0;
        int m = 0;
        int s = 0;

        //if ()

        return h + ":" + m + ":" + s;
    }

    private void stringToTime(String duration) {
        String[] var = duration.split(":", 3);
        setHours(Integer.parseInt(var[0]));
        setMinutes(Integer.parseInt(var[1]));
        setSeconds(Integer.parseInt(var[2]));

    }
}
