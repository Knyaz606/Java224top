package homework_3;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x % 2 == 0 || y % 2 == 0 ) {
            System.out.println("Yes");
        } else {
            System.out.println("Программа ничего не выводит");



        }
    }
}

