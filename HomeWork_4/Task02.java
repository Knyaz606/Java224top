package HomeWork_4;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {

       /* Задание 2
Вывести на консоль 2 в степени n. Для вычисления использовать только побитовые операции.*/

            Scanner scanner = new Scanner(System.in);
            System.out.println("Выводим 2 в степени - выборстепени ниже\nЦивра 1 вторая степень\nЦифра 2 третья степень\nи т.д.");
            int i = scanner.nextInt();
            int n = 0b10;
            int rezyltat = n << i;
            System.out.printf("%d -> %32s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
