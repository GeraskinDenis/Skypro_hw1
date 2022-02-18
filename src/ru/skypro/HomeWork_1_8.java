package ru.skypro;

import java.util.Arrays;

public class HomeWork_1_8 {

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0);
    }

    public static String getAppLink(byte OS, int yearOfManufacture) {
        String strOS;
        if (OS == 0) {
            strOS = "iOS";
        } else if (OS == 1) {
            strOS = "Android";
        } else {
            return "Не верно указана операционная система устройства!";
        }
        return String.format("Установите %s версию приложения для %s по ссылке"
                , (yearOfManufacture < 2015) ? "облегченную" : "\b", strOS);
    }

    public static int getNumberOfDeliveryDays(int deliveryDistance) {
        int maxDeliveryDays = 100;
        int deliveryDays = 1;

        if (deliveryDistance > maxDeliveryDays) {
            System.out.printf("Расстояние доставки превышает максимально допустимое расстояние %d км.!\n", maxDeliveryDays);
            return -1;
        }

        if (deliveryDistance > 20) {
            deliveryDays++;
        }

        if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays++;
        }

        return deliveryDays;
    }

    public static void repeatingChar(String line) {
        for (int i = 0; i < (line.length() - 1); i++) {
            if (line.charAt(i) == line.charAt(i + 1)) {
                System.out.println("Строка содержит повторяющийся символ: " + line.charAt(i));
                return;
            }
        }
        System.out.println("Строка не содержит дубли!");
    }

    public static void reverseOrder(int[] ints) {
        for (int i = 0; i < ints.length / 2; i++) {
            int tmp = ints[i];
            ints[i] = ints[ints.length - 1 - i];
            ints[ints.length - 1 - i] = tmp;
        }
    }

    public static void main(String[] args) {

        // Задание №1
        {
            System.out.println("\nЗадание №1");
            int year = 2022;
            if (isLeapYear(year)) {
                System.out.println(year + " - високосный год");
            } else {
                System.out.println(year + " - не високосный год");
            }
        }

        // Задание №2
        {
            System.out.println("\nЗадание №2");
            System.out.println(getAppLink((byte) 0, 2007));
            System.out.println(getAppLink((byte) 1, 2020));
        }

        // Задание №3
        {
            System.out.println("\nЗадание №3");
            int deliveryDistance = 165;
            int numberOfDeliveryDays = getNumberOfDeliveryDays(deliveryDistance);
            if (numberOfDeliveryDays > 0) {
                System.out.println("Для доставки на расстояние " + deliveryDistance + " км. потребуется " + numberOfDeliveryDays + " дн.");
            }
        }

        // Задание №4
        {
            System.out.println("\nЗадание №4");
            repeatingChar("aabccddefgghiijjkk");
        }

        // Задание №5
        {
            System.out.println("\nЗадание №5");
            int[] ints = {3, 2, 1, 6, 5};
            reverseOrder(ints);
            System.out.println(Arrays.toString(ints));
        }
    }
}
