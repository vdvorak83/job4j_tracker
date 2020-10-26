package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Ivanov Ivan");
        student.setGroup("777");
        student.setAdmissionDate("2020");
        System.out.println(student.getFullName()
                + " entered College in "
                + student.getAdmissionDate()
        + " in the " + student.getGroup() + " group.");
    }
}
