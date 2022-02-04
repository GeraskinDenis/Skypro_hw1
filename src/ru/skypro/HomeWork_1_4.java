package ru.skypro;

public class HomeWork_1_4 {
    public static void main(String[] args) {
        // Задание 1
        {
            System.out.println("\nЗадание 1");
            int i = 0;
            while (i < 10) {
                System.out.print(++i + " ");
            }
            System.out.println();
            for (; i > 0; i--) {
                System.out.print(i + " ");
            }
        }
        // Задание 2
        {
            System.out.println("\nЗадание 2");
            int firstFriday = 2;
            final int DAYS_IN_WEEK = 7;
            int daysInMonth = 31;
            for (int currentDay = firstFriday; currentDay <= daysInMonth; currentDay += DAYS_IN_WEEK) {
                System.out.println("Сегодня пятница, " + currentDay + "-е число.");
            }

        }
        // Задание 3
        {
            System.out.println("\nЗадание 3");
            final int COMET_PERIOD = 79;
            int currentYear = 2022;
            int yearsAgo = 200;
            for (int yearOfComet = 0; yearOfComet < currentYear + COMET_PERIOD; yearOfComet += COMET_PERIOD) {
                if (yearOfComet > currentYear - yearsAgo) {
                    System.out.println(yearOfComet);
                }
            }
        }
    }
}
