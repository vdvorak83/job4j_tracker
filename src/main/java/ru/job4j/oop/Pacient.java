package ru.job4j.oop;

public class Pacient extends Doctor {

    @Override
    public Diagnosis heal(Pacient pacient) {
        return super.heal(pacient);
    }

    @Override
    public Pacient getPacient() {
        return super.getPacient();
    }

    @Override
    public void setPacient(Pacient pacient) {
        super.setPacient(pacient);
    }
}