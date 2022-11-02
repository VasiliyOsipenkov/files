package ru.avalon.javapp.devj110.files;

public class Main {

    public static void main(String[] args) {

        AbstractFile [] files = {
                new Docs("j110-lab2.pdf", 232125,  "pdf ", 2),
                new Docs("j110-slides.pptx", 639616, "pptx", 8),
                new Image("spb-map.png", 7030527, "image", "2048x6144"),
                new Audio("06-PrettyGirl.mp3", 7893454, "audio", "Eric Clapton, Pretty Girl", "05:28"),
                new Video("BackToTheFuture1.avi", 1470984192, "video", "Back to the future I, 1985", "01:48:08", "640x352")
        };
        AbstractFile.printAll(files);

    }
}
