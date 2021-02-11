package ru.job4j.oop;

public class Doctor extends Profession {
    private Diagnosis heal;
    private Pacient pacient;

    public Diagnosis heal(Pacient pacient) {
         return heal;
    }

    public void setHeal(Diagnosis heal) {
        this.heal = heal;
    }

    public Pacient getPacient() {
        return pacient;
    }

    public void setPacient(Pacient pacient) {
        this.pacient = pacient;
    }
}
