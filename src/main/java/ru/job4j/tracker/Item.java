package ru.job4j.tracker;
import java.time.LocalDateTime;

public class Item {

    private int id;
    private String name;
    private final LocalDateTime created = LocalDateTime.now();

    public Item() {
    }

    public Item(int id) {

    }

    public Item(String name, int id) {

    }

    public LocalDateTime getCreated() {
        return created;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
