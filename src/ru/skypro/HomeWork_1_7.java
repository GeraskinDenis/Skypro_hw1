package ru.skypro;

public class HomeWork_1_7 {
    public static void main(String[] args) {
        // Задание №1
        {
            System.out.println("\nЗадание №1");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("ФИО сотрудника - " + fullName);
        }

        // Задание №2
        {
            System.out.println("\nЗадание №2");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Данные ФИО сотрудника для заполнения отчета - " + fullName.toUpperCase());
        }

        // Задание №3
        {
            System.out.println("\nЗадание №3");
            String firstName = "Ivan";
            String middleName = "Ivanovich";
            String lastName = "Ivanov";
            String fullName = lastName + " " + firstName + " " + middleName;
            System.out.println("Данные ФИО сотрудника для административного отдела - " + fullName.replaceAll(" ", "; "));
        }

        // Задание №4
        {
            System.out.println("\nЗадание №4");
            String fullName = "Иванов Семён Семёнович";
            System.out.println("Данные ФИО сотрудника - " + fullName.replaceAll("ё", "е"));
        }
    }
}
