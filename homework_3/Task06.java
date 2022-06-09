package homework_3;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите год : ");
        int a = sc.nextInt();
        if (a % 100 == 0 && a % 400 == 0) {
            System.out.println("количество дней в году: 366");

        } else if (a % 4 == 0 && a % 100 > 0) {
            System.out.println("количество дней в году: 366");
        } else {
            System.out.println("количество дней в году: 365");
        }
    }
}

