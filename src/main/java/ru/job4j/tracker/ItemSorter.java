package ru.job4j.tracker;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Alex"),
                new Item("Petr"),
                new Item("Kirill")
        );
        items.sort(new SortByNameItem());
        System.out.println(items);
        items.sort(new SortByNameItemReverse());
        System.out.println(items);
    }
}
