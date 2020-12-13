package ru.job4j.singleton;

import ru.job4j.tracker.Tracker;

public class TrackerSingleTwo {
    private static Tracker instance;

    private TrackerSingleTwo() {
    }

    public static Tracker getTracker() {
        if (instance == null) {
            instance = new Tracker();
        }
        return instance;
    }
}
