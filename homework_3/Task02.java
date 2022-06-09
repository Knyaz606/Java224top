package homework_3;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите время от 0 до 24 часов: ");
        int time = scanner.nextInt();
        if (time <= 4) {
            System.out.println("Доброй ночи");
        } else if (time <= 10) {
            System.out.println("Доброе утро");
        } else if (time <= 16) {
            System.out.println("Добый день");
        } else if (time <= 22) {
            System.out.println("Добрый вечер");
        } else if (time <= 24) {
            System.out.println("Добрый ночи");

        }
    }
}