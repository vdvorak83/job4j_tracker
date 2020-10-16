package ru.job4j.oop;

public class Ball {
    public Ball tryRun(boolean check) {
        if (check) {
            System.out.println("Колобок был съеден");
        } else {
            System.out.println("Колобок дальше побежал");
        }
        return null;
    }
}
