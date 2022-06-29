package HomeWork_5_1;

import java.util.Scanner;

public class Task9 {
    //Уменя неполучилось как в задании примерно только и то с интернета списал. Я пытался переделать но без успешно.
    // Было бы больше времяни для этого задания, скорей всего бы разобрался.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 3 размера для трех треугольников через пробел, например (5 8 10)");
        int num = sc.nextInt();
        int a = num * 2 - 1;
        for (int i = 0; i < num; i++) {
            for (int j = 0; j < a; j++) {
                if (i == num - 1 || j + i == num - 1 || j - i == num - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        int num1 = sc.nextInt();
        int a1 = num1 * 2 - 1;
        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < a1; j++) {
                if (i == num1 - 1 || j + i == num1 - 1 || j - i == num1 - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
        int num2 = sc.nextInt();
        int a2 = num2 * 2 - 1;
        for (int i = 0; i < num2; i++) {
            for (int j = 0; j < a2; j++) {
                if (i == num2 - 1 || j + i == num2 - 1 || j - i == num2 - 1) {
                    System.out.print("*");
                } else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}