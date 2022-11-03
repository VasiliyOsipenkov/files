package ru.avalon.javapp.devj110.files;

public class Duration {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

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
        String h = "";
        String m = "";
        String s = "";

        if (Integer.toString(hours).length() < 2 && hours !=0)
            h = "0" + hours + ":";
        else if (hours != 0)
            h = Integer.toString(hours) + ":";

        if (Integer.toString(minutes).length() < 2 && minutes != 0)
            m = "0" + minutes + ":";
        else if (minutes != 0)
            m = Integer.toString(minutes) + ":";

        if (Integer.toString(seconds).length() < 2 && seconds != 0)
            s = "0" + seconds;
        else
            s = Integer.toString(seconds);
        return h + m + s;
    }

    private void stringToTime(String duration) {
        String[] var = duration.split(":", 3);
        if (var.length > 3)
            throw new IllegalArgumentException("Некорректный формат ввода длительности");
        if (var.length == 3) {
            setHours(Integer.parseInt(var[0]));
            setMinutes(Integer.parseInt(var[1]));
            setSeconds(Integer.parseInt(var[2]));
        }
        if (var.length == 2) {
            setMinutes(Integer.parseInt(var[0]));
            setSeconds(Integer.parseInt(var[1]));
        }
        if (var.length == 1)
            setSeconds(Integer.parseInt(var[0]));
    }
}
