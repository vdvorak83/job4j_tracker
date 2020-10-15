package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Position = " + position + ":");
            System.out.println("Пусть бегут неуклюже\n" +
                    "Пешеходы по лужам,\n" +
                    "А вода по асфальту рекой.\n" +
                    "И не ясно прохожим\n" +
                    "В этот день непогожий,\n" +
                    "Отчего я веселый такой... \n");
        } else if (position == 2) {
            System.out.println("Position = " + position + ":");
            System.out.println("Спят усталые игрушки, книжки спят.\n" +
                    "Одеяла и подушки ждут ребят.\n" +
                    "Даже сказка спать ложится,\n" +
                    "Чтобы ночью нам присниться.\n" +
                    "Ты ей пожелай:\n" +
                    "Баю-бай... \n");
        } else {
            System.out.println("Position = " + position + ":");
            System.out.println("Песня не найдена");
        }
    }

    public static void main(String[] args) {
        Jukebox jukebox = new Jukebox();
        jukebox.music(1);
        jukebox.music(2);
        jukebox.music(5);
        jukebox.music(3);
        jukebox.music(9);
    }
}
