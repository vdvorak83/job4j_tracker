package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class ItemSorter {
    public static void main(String[] args) {
        List<Item> items = Arrays.asList(
                new Item("Alex", 1),
                new Item("Petr", 2),
                new Item("Kirill", 3)
        );
        items.sort(new SortByNameItem());
        System.out.println(items);
        items.sort(new SortByNameItemReverse());
        System.out.println(items);
        items.sort(new SortByIdItem());
        System.out.println(items);
    }
}
