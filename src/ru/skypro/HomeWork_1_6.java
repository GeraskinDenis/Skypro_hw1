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

        // Задачи повышенной сложности
        // Задание 5
        System.out.println("\nЗадание 5");
        {
            int[][] matrix = new int[3][3];
            for (int i = 0; i < matrix.length; i++) {
                matrix[i][i] = 1;
                matrix[i][matrix.length - 1 - i] = 1;
            }
            for (int[] row : matrix) {
                for (int column : row) {
                    System.out.print(column + " ");
                }
                System.out.println();
            }
        }

        // Задание 6
        System.out.println("\nЗадание 6");
        {
            int[] ints = {5, 4, 3, 2, 1};
            int[] copyOfInts = new int[ints.length];
            int maxIndex = ints.length - 1;
            for (int i = 0; i < ints.length; i++) {
                copyOfInts[maxIndex - i] = ints[i];
            }
            System.out.println(Arrays.toString(copyOfInts));
        }

        // Задание 7
        System.out.println("\nЗадание 7");
        {
            int[] ints = {5, 4, 3, 2, 1};
            int maxIndex = ints.length - 1;
            for (int i = 0; i < ints.length / 2; i++) {
                ints[i] += ints[maxIndex - i];
                ints[maxIndex - i] = ints[i] - ints[maxIndex - i];
                ints[i] = ints[i] - ints[maxIndex - i];
            }
            System.out.println(Arrays.toString(ints));
        }

        // Задание 8
        System.out.println("\nЗадание 8");
        {
            int[] ints = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
            final int SUM = -2;
            Arrays.sort(ints);
            int maxIndex = ints.length - 1;
            boolean needBreak = false;
            for (int i = 0; ints[i] < 0; i++) {
                int searchNumber = SUM - ints[i];
                for (int ii = maxIndex; ints[ii] >= searchNumber; ii--) {
                    if (ints[ii] == searchNumber) {
                        System.out.printf("Сумма чисел %d и %d равно %d\n", ints[i], ints[ii], ints[i] + ints[ii]);
                        needBreak = true;
                        break;
                    }
                }
                if (needBreak) break;
            }
        }

        // Задание 9
        System.out.println("\nЗадание 9");
        {
            int[] ints = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
            final int SUM = -2;
            Arrays.sort(ints);
            int maxIndex = ints.length - 1;
            for (int i = 0; ints[i] < 0; i++) {
                int searchNumber = SUM - ints[i];
                for (int ii = maxIndex; ints[ii] >= searchNumber; ii--) {
                    if (ints[ii] == searchNumber) {
                        System.out.printf("Сумма чисел %d и %d равно %d\n", ints[i], ints[ii], ints[i] + ints[ii]);
                        maxIndex = ii - 1;
                        break;
                    }
                }
            }
        }
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
