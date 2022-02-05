package ru.skypro;

import javax.crypto.spec.PSource;

public class HomeWork_1_3 {
    public static void main(String[] args) {
        // Задание 1
        {
            System.out.println("\nЗадание №1");
            byte clientOS = 0;
            if (clientOS == 0) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
        // Задание 2
        {
            System.out.println("\nЗадание №2");
            int clientDeviceYear = 2015;
            byte clientOS = 1;
            if (clientOS == 0) {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
            } else {
                if (clientDeviceYear >= 2015) {
                    System.out.println("Установите версию приложения для Android по ссылке");
                } else {
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                }
            }
        }
        // Задание 3
        {
            System.out.println("\nЗадание №3");
            int year = 2000;
            if ((year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0)) {
                System.out.println(year + " год является високосным.");
            } else {
                System.out.println(year + " год не является високосным.");
            }
        }
        // Задание 4
        {
            System.out.println("\nЗадание №4");
            int deliveryDistance = 95;
            int deliveryDays = 1;
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            if (deliveryDistance > 60 && deliveryDistance <= 100) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        // Задание 5
        {
            System.out.println("\nЗадание №5");
            int monthNumber = 12;
            String season;

            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    season = "winter";
                    break;
                case 3:
                case 4:
                case 5:
                    season = "spring";
                    break;
                case 6:
                case 7:
                case 8:
                    season = "summer";
                    break;
                case 9:
                case 10:
                case 11:
                    season = "autumn";
                    break;
                default:
                    season = "ERROR: The month number is incorrect.";
            }
            System.out.println(season);
        }
    }
}
