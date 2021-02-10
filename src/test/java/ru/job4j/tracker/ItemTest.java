package ru.job4j.tracker;

import org.junit.Test;

import java.util.Comparator;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void whenByName1lessName2() {
        Comparator<Item> cmpName = new SortByNameItem().thenComparing(new SortByNameItem());
        int rsl = cmpName.compare(
                new Item("Alex"),
                new Item("Ivan")
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenByName2lessName1() {
        Comparator<Item> cmpName = new SortByNameItem().thenComparing(new SortByNameItem());
        int rsl = cmpName.compare(
                new Item("Petr"),
                new Item("Bob")
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenByName1equalName2() {
        Comparator<Item> cmpName = new SortByNameItem().thenComparing(new SortByNameItem());
        int rsl = cmpName.compare(
                new Item("Petr"),
                new Item("Petr")
        );
        assertThat(rsl, equalTo(0));
    }
}