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

    /*public static void printAll(AbstractFile [] files) {
        System.out.println("File name; Size; Details");

        for (AbstractFile file : files) {
            System.out.println(file.getName() + ", " + file.getSize() + ", " + file.Details());
        }

    }*/
    public static void printAll(AbstractFile [] files) {
        int nameLength = 9,
                sizeLength = 4,
                detailsLength = 7;
        for (AbstractFile file : files) {
            if (file.name.length() > nameLength)
                nameLength += file.name.length() - nameLength;
            if (Integer.toString(file.size).length() > sizeLength)
                sizeLength += Integer.toString(file.size).length() - sizeLength;
            if (file.Details().length() > detailsLength)
                detailsLength += file.Details().length() - detailsLength;
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

        for (int i = (detailsLength - 7)/2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.print("Details");
        for (int i = (detailsLength - 7)/2; i > 0; --i) {
            System.out.print(" ");
        }
        System.out.println();

        for (int i = nameLength; i > 0; --i) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = sizeLength; i > 0; --i) {
            System.out.print("-");
        }
        System.out.print("+");
        for (int i = detailsLength; i > 0; --i) {
            System.out.print("-");
        }
        System.out.println();

        for (AbstractFile file : files) {
            System.out.print(file.getName());
            for (int i = (nameLength - file.getName().length()); i > 0; --i) {
                System.out.print(" ");
            }
            System.out.print("|");

            for (int i = (sizeLength - Integer.toString(file.getSize()).length()); i > 0; --i) {
                System.out.print(" ");
            }
            System.out.print(file.getSize());
            System.out.print("|");

            System.out.print(file.Details());
            System.out.println();
        }
        for (int i = nameLength + sizeLength + detailsLength + 2; i > 0; --i) {
            System.out.print("-");
        }

    }
}
