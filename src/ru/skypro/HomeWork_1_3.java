package ru.skypro;

import javax.crypto.spec.PSource;

public class HomeWork_1_3 {
    public static void main(String[] args) {
        /**
         * 1.3 УСЛОВНЫЕ ОПЕРАТОРЫ
         */


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

        // Задание 6
        {
            System.out.println("\nЗадание 6");
            int age = 19;
            int salary = 100_000;
            float result = 0;

            if (age < 23) {
                result = salary * 2;
            } else if (age >= 23) {
                result = salary * 3;
            }

            if (salary >= 80_000) {
                result *= 1.2F;
            } else if (salary >= 50_000) {
                result *= 1.5F;
            }
            System.out.printf("Мы готовы выдать вам кредитную карту с лимитом %.2f рублей\n", result);
        }

        // Задание 7
        {
            System.out.println("\nЗадание 7");
            // Входные параметры
            float rate = 10;
            int loanTermInMonths = 12;
            int maximumPercentageOfSalary = 50;
            int age = 25;
            int salary = 60_000;
            int wantedSum = 330_000;
            boolean loanApproved;

            // Находим ставку
            if (age <= 23) {
                rate += 1;
            } else if (age < 30) {
                rate += 0.5F;
            }

            if (salary > 80_000) {
                rate -= 0.7;
            }

            // Расчетаем первый платёж по кредиту
            double loanBodyPerMonth = wantedSum / loanTermInMonths;
            double interestAmount = wantedSum * rate / loanTermInMonths / 100;
            double firstPayment = loanBodyPerMonth + interestAmount;

            // Расчетаем максимальный платёж по кредиту
            float maxPayment = salary * maximumPercentageOfSalary / 100;
            loanApproved = maxPayment > firstPayment;

            // Выводим результат
            System.out.printf("Максимальный платеж при ЗП %d равен %.2f рублей. Платеж по кредиту %.2f рублей. "
                    + ((loanApproved) ? "Одобрено." : "Отказано.") + "\n", salary, maxPayment, firstPayment);
        }
    }
}
