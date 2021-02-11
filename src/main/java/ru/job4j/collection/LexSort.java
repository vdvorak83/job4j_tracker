package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
       String[] l1 = left.split("\\.");
       String[] r1 = right.split("\\.");
       int a = Integer.parseInt(l1[0]);
       int b = Integer.parseInt(r1[0]);
       return Integer.compare(a, b);
    }
}