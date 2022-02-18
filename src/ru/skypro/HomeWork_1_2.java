package ru.skypro;

/**
 * Переменные
 */

public class HomeWork_1_2 {
    public static void main(String[] args) {

        // Задача 1
        // Целые числа
        byte vByte = 12;
        short vShort = 200;
        int vInt = 99_999;
        long vLong = 99_999_999L;
        // Дробные числа
        float vFloat = 0.123F;
        double vDouble = 10.45;

        // Задача 2
        float boxerWeight1 = 78.2F;
        float boxerWeight2 = 82.7F;
        System.out.println("Общий вес двух бойцов: " + (boxerWeight1 + boxerWeight2));
        System.out.println("Разница между весами бойцов: " + (boxerWeight2 - boxerWeight1));

        // Задача 3
        System.out.println();
        int bananaWeight = 80;
        int milkWeight = 105;
        int iceCreamWeight = 100;
        int eggWeight = 70;
        int breakfastWeight = (bananaWeight * 5) + (milkWeight * 2)
                + (iceCreamWeight * 2) + (eggWeight * 4);
        System.out.println("Вес спорт-завтрака " + breakfastWeight + " гр.");
        float breakfastWeightKg = breakfastWeight / 1_0000F;
        System.out.println("Вес спорт-завтрака " + breakfastWeightKg + " кг.");

        // Задача 4
        System.out.println();
        int overweight = 7;
        System.out.println("Количество дней (потеря 250 гр/день): " + (overweight * 1_000 / 250));
        System.out.println("Количество дней (потеря 500 гр/день): " + (overweight * 1_000 / 500));

        // Задача 5
        System.out.println();
        float interest = 10F;

        float marySalary = 67760F;
        float maryNewSalary = marySalary * (1F + interest / 100F);
        System.out.println("Маша теперь получает " + maryNewSalary + " рублей. Годовой доход вырос на "
                + ((maryNewSalary - marySalary) * 12) + " рублей.");

        int denisSalary = 83690;
        float denisNewSalary = denisSalary * (1F + interest / 100F);
        System.out.println("Денис теперь получает " + denisNewSalary + " рублей. Годовой доход вырос на "
                + ((denisNewSalary - denisSalary) * 12) + " рублей.");

        int kristinaSalary = 76230;
        float kristinaNewSalary = kristinaSalary * (1F + interest / 100F);
        System.out.println("Кристина теперь получает " + kristinaNewSalary + " рублей. Годовой доход вырос на "
                + ((kristinaNewSalary - kristinaSalary) * 12) + " рублей.");

        // Задача 6
        {
            System.out.println();
            int a = 12;
            int b = 27;
            int c = 44;
            int d = 15;
            int e = 9;
            int result = a * (b + (c - d * e));
            System.out.println(-result);
        }

        // Задача 7
        {
            System.out.println();
            int a = 5;
            int b = 7;
            a = a + b;
            b = a - b;
            a = a - b;
        }

        // Задача 8
        {
            System.out.println();
            int a = 875;
            int b = a % 100 / 10;
        }
    }
}
