package Massivi_6;

import java.util.ArrayList;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        /*Задание 2
Заполнить массив на 30 элементов случайными числами
от -70 до +50. Найти минимальный элемент и вывести его
на консоль. Найти максимальный элемент и вывести его на
консоль.*/
        Random rand = new Random (30);

        int[] fib = new int[rand.nextInt(-70,+50)];
        for(int i = 0; i < fib.length; i++){
            fib[i] = rand.nextInt(-70,+50);
        }
        for(int i = 0; i < fib.length; i++){

             // System.out.println(fib[i]);
        }
        int min = fib[0];
        int max = fib[0];
        for(int i = 0; i < fib.length; i++) {
            if (min > fib[i]) {
                min = fib[i];
            } else if (max < fib[i]) {
                max = fib[i];
            }
        }
            System.out.println("Минимальное число" + min);
            System.out.println("Максимальное число" + max);

    }
}