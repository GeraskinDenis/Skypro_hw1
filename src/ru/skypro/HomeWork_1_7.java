package ru.skypro;

/**
 * Строки
 */

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

        // Задание №5
        {
            System.out.println("\nЗадание №5");
            String fullName = "Ivanov Ivan Ivanovich";
            int firstIndexOfGap = fullName.indexOf(" ");
            int lastIndexOfGap = fullName.lastIndexOf(" ");
            String lastName = fullName.substring(0, firstIndexOfGap);
            String firstName = fullName.substring(firstIndexOfGap, lastIndexOfGap);
            String middleName = fullName.substring(lastIndexOfGap);
            System.out.println("Имя сотрудника - " + firstName);
            System.out.println("Фамилия сотрудника - " + lastName);
            System.out.println("Отчество сотрудника - " + middleName);
        }

        // Задание №6
        {
            System.out.println("\nЗадание №6");

            // Вариант 1
            // Универсальный вариант - преобразует первую букву каждого слова в строке в заглавную
            String fullName = "ivanov ivan ivanovich";
            System.out.println("\nВариант 1");
            String[] strings = fullName.split(" ");
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < strings.length; i++) {
                char[] chars = strings[i].toCharArray();
                chars[0] = Character.toUpperCase(chars[0]);
                if (builder.length() != 0) {
                    builder.append(" ");
                }
                builder.append(chars);
            }
            System.out.println(builder);

            // Вариант 2
            // Данный вариант "заточен" для формата строки "Фамилия Имя Отчество"
            System.out.println("\nВариант 2");
            char[] chars = fullName.toCharArray();
            chars[0] = Character.toUpperCase(chars[0]);
            int index = fullName.indexOf(" ") + 1;
            chars[index] = Character.toUpperCase(chars[index]);
            index = fullName.lastIndexOf(" ") + 1;
            chars[index] = Character.toUpperCase(chars[index]);
            System.out.println(String.valueOf(chars));
        }

        // Задание №7
        {
            System.out.println("\nЗадание №7");
            String line1 = "135";
            String line2 = "246";
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < line1.length(); i++) {
                builder.append(line1.charAt(i))
                        .append(line2.charAt(i));
            }
            System.out.println(builder);
        }

        // Задание №8
        {
            System.out.println("\nЗадание №8");
            String line = "aabccddefgghiijjkk";
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length - 1; ) {
                if (chars[i] == chars[i + 1]) {
                    System.out.print(chars[i]);
                    i += 2;
                } else {
                    i++;
                }
            }
        }
    }
}
