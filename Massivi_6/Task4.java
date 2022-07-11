package Massivi_6;

public class Task4 {
    public static void main(String[] args) {
       /*Задание 4
        Написать программу, которая проверяет, все ли значения
        элементов массива различные (не повторяются). Вывести:
        Yes – если все различные и No – если имеется хоть одно повторение. Массив задается и инициализируется в начале
        программы*/
    int[] mas = new int[] { 1, 2, 3, 4, 7, 7, 7 };
    int value = mas[0];
    int count = 1;

        for (int i = 1; i < mas.length; i++) {
        if (mas[i] != value) {
            count++;
        }
    }
        if (count == mas.length) {
        System.out.println("Yes");
    } else {
        System.out.println("No");
    }

}

}//НЕРАБОТАЕТ

