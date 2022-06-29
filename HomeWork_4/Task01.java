package HomeWork_4;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

       /* Задание 1
        Обнулить бит в нулевом разряде числа N. Остальные
        биты не должны изменить свое значение. Вывести на консоль в двоичном виде.*/

        int n = 39;
        System.out.printf("%d -> %33s\n", n, Integer.toBinaryString(n));

        int i = 0;
        int rezyltat = n & ~(1 << i);
        System.out.printf("%d -> %33s\n", rezyltat, Integer.toBinaryString(rezyltat));

        // int nym = n & 0b101100; // 2 вариант
        //System.out.printf("%d -> %33s\n", nym, Integer.toBinaryString(nym)); // 2 вариант


    }
}
