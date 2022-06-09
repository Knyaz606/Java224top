package homework_3;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите точку на плоскости : ");
        double x = sc.nextInt();
        double y = sc.nextInt();
        if (x > 0 && y > 0) {
            System.out.println("I");
        } else if (x < 0 && y > 0) {
            System.out.println("II");
        } else if (x < 0 && y < 0) {
            System.out.println("III");
        } else if (x > 0 && y < 0) {
            System.out.println("IV");
        } else {
            System.out.println("0");


        }
    }
}


