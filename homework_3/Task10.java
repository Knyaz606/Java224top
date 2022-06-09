package homework_3;

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите номер квартиры : ");

        int m = 5;
        int n = sc.nextInt();
        if (0 <= n && 45 >= n) {
            System.out.println("1 подьезд");
        } else if (46 <= n && 90 >= n ) {
            System.out.println("2 подьезд");
        } else if (91 <= n && 135 >= n) {
            System.out.println("3 подьезд");
        } else if (136 <= n && 180 >= n) {
            System.out.println("4 подьезд");
        } else if (181 <= n && 225 >= n) {
            System.out.println("5 подьезд");
        }
    }
}
