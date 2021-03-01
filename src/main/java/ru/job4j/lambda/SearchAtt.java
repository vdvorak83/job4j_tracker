package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SearchAtt {
    private static List<Attachment> filter(List<Attachment> list, Predicate<Attachment> predicate) {
        List<Attachment> rsl = new ArrayList<>();
        for (Attachment att : list) {
                if (predicate.test(att)) {
                    rsl.add(att);
                }
        }
        return rsl;
    }

    public static List<Attachment> filterSize(List<Attachment> list) {
           Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment att) {
                return att.getSize() > 100;
            }
        };
        return filter(list, predicate);
    }

    public static List<Attachment> filterName(List<Attachment> list) {
        Predicate<Attachment> predicate = new Predicate<>() {
            @Override
            public boolean test(Attachment att) {
                return att.getName().contains("bug");
            }
        };
        return filter(list, predicate);
    }

    public static void main(String[] args) {
        List<Attachment> rsl = Arrays.asList(
                new Attachment("bug", 141),
                new Attachment("Image", 111),
                new Attachment("No bug", 100)
        );
        System.out.println("Size > 100 : " + filterSize(rsl));
        System.out.println("Name contains 'bug' : " + filterName(rsl));
    }
}
