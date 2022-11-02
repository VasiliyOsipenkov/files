package ru.avalon.javapp.devj110.files;

public abstract class File {
    private String name;
    private long size;
    private String format;

    public File(String name, long size, String format) {
        setName(name);
        setSize(size);
        setFormat(format);
    }

    public String getName() {
        return name;
    }

    public long getSize() {
        return size;
    }

    public String getFormat() {
        return format;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSize(long size) {
        this.size = size;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    abstract String getDetails();

    /*public static void printAll(AbstractFile [] files) {
        System.out.println("File name; Size; Details");

        for (AbstractFile file : files) {
            System.out.println(file.getName() + ", " + file.getSize() + ", " + file.Details());
        }

    }*/
    public static void printAll(File [] files) {
        int nameLength = 9,
                sizeLength = 4,
                detailsLength = 7;
        for (File file : files) {
            if (file.name.length() > nameLength)
                nameLength += file.name.length() - nameLength;
            if (Long.toString(file.size).length() > sizeLength)
                sizeLength += Long.toString(file.size).length() - sizeLength;
            if (file.getDetails().length() > detailsLength)
                detailsLength += file.getDetails().length() - detailsLength;
        }
        for (int i = nameLength + sizeLength + detailsLength + 2; i > 0; --i) {
            System.out.print("-");
        }

        System.out.println();
        for (int i = (nameLength - 9)/2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.print("File name");
        for (int i = (nameLength - 9)/2 + (nameLength - 9)%2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.print("|");

        for (int i = (sizeLength - 4)/2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.print("Size");
        for (int i = (sizeLength - 4)/2 + (sizeLength - 4)%2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.print("|");

        System.out.print(" ");
        System.out.print("Details");
        System.out.print(" ");
        System.out.println();

        for (int i = nameLength; i > 0; --i) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = sizeLength; i > 0; --i) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = 9; i > 0; --i) {
            System.out.print("-");
        }
        System.out.println();

        for (File file : files) {
            System.out.print(file.getName());
            for (int i = (nameLength - file.getName().length()); i > 0; --i) {
                System.out.print(" ");
            }
            System.out.print("|");

            for (int i = (sizeLength - Long.toString(file.getSize()).length()); i > 0; --i) {
                System.out.print(" ");
            }
            System.out.print(file.getSize());
            System.out.print("|");

            System.out.print(file.getDetails());
            System.out.println();
        }
        for (int i = nameLength + sizeLength + detailsLength + 2; i > 0; --i) {
            System.out.print("-");
        }

    }
}
