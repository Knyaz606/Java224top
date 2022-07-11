package Massivi_6;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task10 {
    /*Задание 10
Заполнить массив размерности n случайными цифрами от 0 до 33. Найти элемент массива, который делится
без остатка на значение элемента слева и значение элемента справа. Вывести на консоль значения исходного массива.
Вывести индекс найденного элемента, если такой не найден,
вывести -1. n – задается с клавиатуры.*/

    //ЧЕСТНО СПИСАЛ ДЛЯ РАЗБОРА
    int size = 0;
    int [] array;
    int count = 0;
    public Task10() {
        System.out.println("введите размер массива число должно целым и не отрицательным");
        Scanner sc = new Scanner(System.in);

        if(sc.hasNextInt()) {
            size = sc.nextInt();
        } else {
            System.err.println("Вы ввели не число или число не целое. Попытайтесь снова.");
        }
        if(size < 0) {
            System.err.println("размер массива не может быть отрицательным числом. Программа будет использовать модуль введенного Вами числа.");
            size = Math.abs(size);
        }
        sc.close();

        Random rand = new Random();
        array = new int[size];

        for(int i = 0; i < size; i ++) {
            array[i] = rand.nextInt(31) + 1 ;// оставить в массиве 0, то будет выпрыгивать ArifmeticException /by zero.
        }
    }
    public void checkEqualArray(int [] a) {

        for (int i = 1; i < a.length - 2; i ++) {
            if ( a[i] % a[i - 1] == 0 && a[i] % a[i + 1] == 0 ) {
                System.out.printf("Число  %d делится без остатка - индекс %d ", array[i], i );
                System.out.println();
                count ++;
            }
        }
        if(count == 0) {
            System.out.println("-1");
        }
    }
    public static void main(String [] args) {
        Task10 a = new Task10();
        System.out.println(Arrays.toString(a.array));
        a.checkEqualArray(a.array);
    }
}