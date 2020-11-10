package ru.job4j.poly;

public class BusOfVehicle implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() +  " двигается по скоростным трассам.");
    }

    @Override
    public int passengers(int number) {
        return 0;
    }
}
