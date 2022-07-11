package Massivi_6;

public class Task3 {
    public static void main(String[] args) {
        /*Задание 3
Написать программу, которая проверяет, все ли значения
элементов массива одинаковые. Вывести: Yes – если все одинаковы и No – если имеется хоть одно различие.
Массив задается и инициализируется в начале программы.*/
        int[] mas = new int[] { 1, 1, 3, 1 };
        int value = mas[0];
        int count = 1;

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] == value) {
                count++;
            }
        }
        if (count == mas.length) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }

}