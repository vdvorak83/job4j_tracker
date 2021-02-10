package ru.job4j.collection;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class JobSorter {
    public static void main(String[] args) {
        List<Job> jobs = Arrays.asList(
                new Job("Fix bug", 1),
                new Job("Fix bug", 4),
                new Job("Fix bug", 2),
                new Job("X task", 0)
        );
        jobs.sort(new JobDescByName());
        System.out.println("Сортировка по имени по убыванию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByNameUp());
        System.out.println("Сортировка по имени по возрастанию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByPriority());
        System.out.println("Сортировка по приоритету по убыванию: ");
        System.out.println(jobs);
        System.out.println();

        jobs.sort(new JobDescByPriorityUp());
        System.out.println("Сортировка по приоритету по возрастанию: ");
        System.out.println(jobs);
        System.out.println();

        System.out.println();
        System.out.println("Сортировка комбо всё по возрастанию: ");
        Comparator<Job> comb = new JobDescByNameLnUp()
                .thenComparing(new JobDescByNameUp())
                .thenComparing(new JobDescByPriorityUp());
        jobs.sort(comb);
        System.out.println(jobs);
    }
}
