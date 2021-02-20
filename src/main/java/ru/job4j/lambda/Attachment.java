package ru.job4j.lambda;

import java.util.Comparator;

public class Attachment {
    private String name;
    private int size;

    public Attachment(String name, int size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "{"
                + "name='" + name + '\''
                + ", size=" + size
                + '}';
    }

    Comparator<Attachment> comparator1 =  new Comparator<Attachment>() {
        @Override
        public int compare(Attachment left, Attachment right) {
            return left.getName().compareTo(right.getName());
        }
    };
}