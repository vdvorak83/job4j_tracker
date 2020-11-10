package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void go() {
    }

    @Override
    public int passengers(int number) {
        return 0;
    }

    @Override
    public int refuel(int litres, int price) {
        return 0;
    }
}
