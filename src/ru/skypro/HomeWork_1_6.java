package ru.skypro;

import java.util.Arrays;
import java.util.Random;

public class HomeWork_1_6 {

    public static void main(String[] args) {
        // Задание 1
        System.out.println("\nЗадание 1");
        int[] arr = generateRandomArray();
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + total + " рублей.");

        // Задание 2
        System.out.println("\nЗадание 2");
        int minCost = Integer.MAX_VALUE;
        int maxCost = 0;
        for (int i : arr) {
            if (i > maxCost) {
                maxCost = i;
            }
            if (i < minCost) {
                minCost = i;
            }
        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей.\n", minCost, maxCost);

        // Задание 3
        System.out.println("\nЗадание 3");
        double middleSpend = total / (double) arr.length;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей.\n", middleSpend);

        // Задание 4
        System.out.println("\nЗадание 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_100) + 100_000;
        }
        return arr;
    }
}
