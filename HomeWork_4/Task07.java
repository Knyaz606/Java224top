package HomeWork_4;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {


         /* Задание 7
Определить значение i-го бита числа N. Вывести результат на консоль в двоичном виде*/

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирите бит чиcла 1,426,569,909 ");
        int i = scanner.nextInt();
        int n = 0b1010101000001111011101010110101;
        System.out.printf("%d -> %36s\n", n, Integer.toBinaryString(n));

        int rezyltat =(n >> i) & 1;
        System.out.printf("%10d -> %36s\n", rezyltat, Integer.toBinaryString(rezyltat));
    }
}
