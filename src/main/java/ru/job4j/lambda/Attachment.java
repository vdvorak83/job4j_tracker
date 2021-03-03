package ru.job4j.lambda;

public class Attachment {
    private final String names;
    private final int size;

    public Attachment(String name, int size) {
        this.names = name;
        this.size = size;
    }

    public String getName() {
        return names;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + names + '\''
                + ", size=" + size
                + '}';
    }
}