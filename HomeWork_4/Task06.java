package HomeWork_4;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {


         /* Задание 6
Обнулить все кроме последних i битов числа N. Вывести результат на консоль в двоичном виде.*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Обнулить все биты кроме (введите число) : ");
        int i = scanner.nextInt();

        int n = 0b10101010_00001111_0111010_10110101;
        System.out.printf("%d -> %36s\n", n, Integer.toBinaryString(n));

        int rezyltat = n >> ~i;
        System.out.printf("%10d -> %36s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
