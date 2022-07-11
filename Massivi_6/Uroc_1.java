package Massivi_6;

import java.util.Scanner;

public class Uroc_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите количество чисел: ");
        int[] number = new int[sc.nextInt()];
        System.out.printf("Введите %d чисел: ", number.length);
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        int min = number[0];
        for (int i = 0; i < number.length; i++) {
            if (min >= number[i]) {
                min = number[i];
            }
        }
        System.out.println(min);
    }
}
