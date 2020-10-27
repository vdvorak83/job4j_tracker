package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book martin = new Book("Clean code", 464);
        Book headFirst = new Book("Изучаем Java", 720);
        Book javaCore = new Book("Java. Библиотека профессионала", 864);
        Book javaBook = new Book("Java. Полное руководство", 1488);
        Book[] books = new Book[4];
        books[0] = martin;
        books[1] = headFirst;
        books[2] = javaCore;
        books[3] = javaBook;

        System.out.println("Создаем 4 объекта Book:");
        for (Book bo : books) {
            System.out.println(bo.getName() + ".(" + bo.getPages() + " pages" + ")");
        }
        System.out.println();
        System.out.println("Переставляем местами книги с индексом 0 и 3:");
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (Book bo : books) {
            System.out.println(bo.getName() + ".(" + bo.getPages() + " pages" + ")");
        }

        System.out.println();
        System.out.println("Цикл с выводом книг с именем \"Clean code\":");
        for (Book bo : books) {
            if (bo.getName().equals("Clean code")) {
                System.out.println(bo.getName() + ".(" + bo.getPages() + " pages" + ")");
            }
        }
    }
}
