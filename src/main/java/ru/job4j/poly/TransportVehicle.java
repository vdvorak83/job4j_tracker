package ru.job4j.poly;

public class TransportVehicle {

    public static void main(String[] args) {

    Vehicle train = new Train();

    Vehicle plane = new Plane();

    Vehicle busOfVehicle = new BusOfVehicle();

    Vehicle[] tpb = new Vehicle[]{train, plane, busOfVehicle};
        tpb[0] = new Train();
        tpb[1] = new Plane();
        tpb[2] = new BusOfVehicle();
       for (Vehicle a : tpb) {
            a.move();
        }
    }
}
