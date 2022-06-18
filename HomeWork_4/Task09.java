package HomeWork_4;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {


         /* Задание 9
Определить имеют ли чисел M и N разные знаки. Используя только побитовые и условные операторы.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("В ведите число для сравнения с числом 1001101");
        int n = scanner.nextInt();
        int m = 0b1001101;
        if (n == m) {
            System.out.printf("Эти 2 числа имеют одинаковае знаки\n%2d -> %s\n", n, Integer.toBinaryString(n));
            System.out.printf("%d -> %s", m, Integer.toBinaryString(m));
        }else{
            System.out.printf("Эти 2 числа не имеют одинаковае знаки\n%2d %s\n", n, Integer.toBinaryString(n));
            System.out.printf("%d %s", m, Integer.toBinaryString(m));
        }
    }
}

