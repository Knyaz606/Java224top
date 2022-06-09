package homework_3;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите № билета ");
        int ticket = sc.nextInt();

        int t1 = ticket / 100000;
        int t2 = (ticket % 100000) / 10000;
        int t3 = (ticket % 10000) / 1000;
        int ticket1 = t1 + t2 + t3;

        int i1 = (ticket % 1000) /100;
        int i2 = (ticket % 100) / 10;
        int i3 = ticket % 10;
        int ticket2 = i1 + i2 + i3;

        if (ticket1 == ticket2) {
            System.out.println("Билет выйгрошный");

        } else {
            System.out.println("Билет проигрешный");
        }
    }
}

