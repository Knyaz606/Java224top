package HomeWork_5;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
       /* Задание 5
        Напишите программу, которая будет проверять, является
        ли число, введенное с клавиатуры палиндромом (одинаково
                читающееся в обоих направлениях). Например, 123454321
        или 221122 – палиндром. Программа должна вывести YES,
        если число является палиндромом, и NO – в противоположном случае.*/


                System.out.println("Введите число для проверки");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int num2 = 0;
        int i = 0;
        int originalNum = num;

        while (num != 0) {
            num2 = num % 10;
            i = i * 10 + num2;
            num = num / 10;
        }

        if (originalNum == i)
            System.out.println("Число палиндром");
        else
            System.out.println("Это число не палиндром");
    }
}

        /* Scanner sc = new Scanner(System.in);
        System.out.println("Введите число для проверки");
        int i = sc.nextInt();
        if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
            System.out.println("Число палиндром");
        } else {
            System.out.println("число не палиндром");
        }
        sc.close();*/
