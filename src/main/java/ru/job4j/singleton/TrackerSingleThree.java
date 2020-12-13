package ru.job4j.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleThree {
    private static final Tracker INSTANCE = new Tracker();

    private TrackerSingleThree() {
    }

    public static Tracker getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {
        Tracker tracker = TrackerSingleThree.getInstance();
    }
}
