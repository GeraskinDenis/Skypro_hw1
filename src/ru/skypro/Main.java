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
    }
}
