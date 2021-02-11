package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int result = 0;
        int count = Math.min(left.length(), right.length());
        for (int i = 0; i < count; i++) {
            result = Character.compare(left.charAt(i), right.charAt(i));
            if (result != 0) {
                return result;
            }
        }
        if (left.length() != right.length()) {
                return Integer.compare(left.length(), right.length());
            }

        return result;
    }
}

