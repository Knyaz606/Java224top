package HomeWork_5;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        /*Задание 10.
2520 – наименьшее число, которое можно разделить на
каждое из чисел от 1 до 10, без остатка. Написать программу, которая рассчитывает
 наименьшее положительное число, которое делится на все числа от 1 до 20.*/
        Scanner sc = new Scanner (System.in);
        for(int i = 190; ; i += 190) {
            if(i % 3 == 0
                    && i % 4 == 0
                    && i % 6 == 0
                    && i % 7 == 0
                    && i % 8 == 0
                    && i % 9 == 0
                    && i % 11 == 0
                    && i % 12 == 0
                    && i % 13 == 0
                    && i % 14 == 0
                    && i % 15 == 0
                    && i % 16 == 0
                    && i % 17 == 0
                    && i % 18 == 0
                    && i % 20 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}
