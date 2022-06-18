package HomeWork_4;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {


         /* Задание 8
Обнулить крайний левый (старший разряд) единичный бит числа N. Вывести результат на консоль в двоичном виде.*/

        Scanner scanner = new Scanner(System.in);
        int n = 0b1110101000001111011101010110101;
        System.out.println("Обнулить крайний левый единичный бит числа");
        System.out.printf("%10d -> %32s\n", n, Integer.toBinaryString(n));

        int i = 30;
        int rezyltat = n ^ (1 << i);
        System.out.printf("%d -> %33s\n", rezyltat, Integer.toBinaryString(rezyltat));

        //int i = 0b0110101000001111011101010110101; // 3 варинт
        //int rezyltat = i & n; // 3 варинт
        //int rezyltat = n >> 1; // (можно еще вот так) вариант 2


        //System.out.printf("%10d -> %36s\n", rezyltat, Integer.toBinaryString(rezyltat)); // 2-3 вариант
    }
}