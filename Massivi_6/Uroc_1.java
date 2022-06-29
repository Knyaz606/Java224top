package Massivi_6;

import java.util.Scanner;

public class Uroc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

// 1 задание в уроке 7 дней зарплата на каждый день.
        System.out.println("Введите количество дней: ");
        int size = sc.nextInt();
        double [] income = new double[size];
        System.out.println("Введите доход на каждый день: ");
        for (int i = 0; i < income.length; i++) {
            System.out.printf("День №%d:", i + 1);
            income[i] = sc.nextDouble();
        }

        for (int i = 0; i < income.length; i++) {
            System.out.printf("%f\n", income[i]);
        }
        sc.close();
    }
}

