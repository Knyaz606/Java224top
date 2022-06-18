package HomeWork_4;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        /* Задание 3
Установить i-й бит числа N равным 1. Вывести результат на консоль в двоичном виде.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите бит числа для установки цивры 1 : 10101 ");
        int i = scanner.nextInt();
        int n = 0b10101;
        int rezyltat = n | (1 << i);
        System.out.printf("%d -> %s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
