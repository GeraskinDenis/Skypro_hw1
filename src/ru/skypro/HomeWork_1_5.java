package ru.skypro;

/**
 * Массивы 1
 */
public class HomeWork_1_5 {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("\nЗадание 1");
        int[] ints = new int[]{1, 2, 3};
        double[] doubles = {1.57, 7.654, 9.986};
        Object[] objects = {"String", 23, false};

        // Задание 2
        System.out.println("\nЗадание 2");
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i]);
            if (i != (ints.length - 1)) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < doubles.length; i++) {
            System.out.print(doubles[i]);
            if (i != (doubles.length - 1)) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
        for (int i = 0; i < objects.length; i++) {
            System.out.print(objects[i]);
            if (i != (objects.length - 1)) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }

        // Задание 3
        System.out.println("\nЗадание 3");
        for (int i = ints.length - 1; i >= 0; i--) {
            System.out.print(ints[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
        for (int i = doubles.length - 1; i >= 0; i--) {
            System.out.print(doubles[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
        for (int i = objects.length - 1; i >= 0; i--) {
            System.out.print(objects[i]);
            if (i != 0) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }

        // Задание 4
        System.out.println("\nЗадание 4");
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] % 2 != 0) {
                ints[i] = ints[i] + 1;
            }
            System.out.print(ints[i]);
            if (i != (ints.length - 1)) {
                System.out.print(",");
            } else {
                System.out.print("\n");
            }
        }
    }
}
