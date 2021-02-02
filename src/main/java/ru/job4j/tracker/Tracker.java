package ru.job4j.tracker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(size++, item);
        return item;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {
        List<Item> items = new ArrayList<>();
        /*int size = 0;*/
        for (int index = 0; index < size; index++) {
            Item item = items.get(index);
            if (item.getName().equals(key)) {
                items.add(size, item);
                size++;
            }
        }
        items = List.copyOf(items);
        return items;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items.get(index) : null;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        item.setId(id);
        if (index != -1) {
            items.add(item);
            return true;
        }
            return false;
    }

    public boolean delete(int id) {
        List<Item> items = new ArrayList<>();
        int index = indexOf(id);
        if (index != -1) {
            List.copyOf(items);
            items.add(size - 1, null);
            size--;
            return true;
        }
            return false;
    }

}