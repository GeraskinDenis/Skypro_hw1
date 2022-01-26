package ru.skypro;

public class Main {
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
        double boxerWeight1 = 78.2;
        double boxerWeight2 = 82.7;
        System.out.println("Общий вес двух бойцов:" + (boxerWeight1 + boxerWeight2));
        System.out.println("Разница между весами бойцов: " + (boxerWeight1 - boxerWeight2));

        // Задача 3
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
        int overweight = 7;
        System.out.println("Количество дней (потеря 250 гр/день): " + (overweight * 1_000 / 250));
        System.out.println("Количество дней (потеря 500 гр/день): " + (overweight * 1_000 / 500));
    }
}
