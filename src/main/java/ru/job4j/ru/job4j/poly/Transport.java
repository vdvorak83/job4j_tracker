package ru.job4j.ru.job4j.poly;

public interface Transport {
    void go();

    int passengers(int number);

    int refuel(int  litres, int price);

}
