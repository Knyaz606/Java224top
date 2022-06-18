package HomeWork_4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {


         /* Задание 8
Обнулить крайний левый (старший разряд) единичный бит числа N. Вывести результат на консоль в двоичном виде.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете бит для проверки етьли там ноль");
        int i = scanner.nextInt();
        int n = 0b1010101000001111011101010110101;
        System.out.printf("%d -> %36s\n", n, Integer.toBinaryString(n));
        int rezyltat = n & 1 << i;
        System.out.printf("%d -> %36s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
