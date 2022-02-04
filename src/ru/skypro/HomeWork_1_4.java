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
        // Задание 4
        {
            System.out.println("\nЗадание 4");
            for (int i = 1; i <= 30; i++) {
                System.out.print(i + ": ");
                if (i % 3 == 0) {
                    System.out.println("ping");
                } else if (i % 5 == 0) {
                    System.out.println("pong");
                } else {
                    System.out.println();
                }
            }
        }
        // Задание 5
        {
            System.out.println("\nЗадание 5");
            int x = 0;
            int y = 1;
            System.out.print(x + " " + y);
            for (int i = 2; i < 10; i++) {
                if (i % 2 == 0) {
                    x += y;
                } else {
                    y += x;
                }
                System.out.print(" " + Math.max(x, y));
            }
        }
        // Задание 6
        {
            System.out.println("\nЗадание 6");
            int age = 19;
            int salary = 58_000;
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
