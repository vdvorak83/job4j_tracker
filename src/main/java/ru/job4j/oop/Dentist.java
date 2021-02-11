package ru.job4j.oop;

public class Dentist extends Doctor {

    @Override
    public String getBirthday() {
        return super.getBirthday();
    }

    @Override
    public void setHeal(Diagnosis heal) {
        super.setHeal(heal);
    }
}
