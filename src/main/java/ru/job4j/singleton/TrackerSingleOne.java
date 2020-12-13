package ru.job4j.singleton;

import ru.job4j.tracker.Tracker;

public enum TrackerSingleOne {
        INSTANCE;
    private final Tracker tracker = new Tracker();

    public Tracker getTracker() {
        return tracker;
    }
}