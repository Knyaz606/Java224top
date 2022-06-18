package HomeWork_4;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {


         /* Задание 5
Установить i-й бит числа N равным 0. Вывести результат на консоль в двоичном виде.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите бит для обнуления 1010101000001111011101010110101 ");
        int i = scanner.nextInt();
        int n = 0b1010101000001111011101010110101;
        System.out.printf("%d -> %36s\n", n, Integer.toBinaryString(n));
        int rezyltat = n & ~(1 << i);
        System.out.printf("%d -> %36s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
