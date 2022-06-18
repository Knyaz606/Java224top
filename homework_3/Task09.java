package homework_3;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);//Это не работает.
        System.out.println("Введите координаты начала плоскости y1: ");
        int smoothY1 = sc.nextInt();
        System.out.println("Введите координаты конца плоскости y2: ");
        int smoothY2 = sc.nextInt();
        System.out.println("Введите координаты максимум вертикали x1: ");
        int slideX1 = sc.nextInt();
        System.out.println("Введите координаты минимум вертикали x2: ");
        int breakageX2 = sc.nextInt();

        if (smoothY1 < smoothY2) {
            System.out.println("Ровная дорога");

        } else if (slideX1 == breakageX2)  {
            System.out.println("Обрыв");

        } else if (smoothY1 < slideX1){
            System.out.println("Горка");

        } else {
            System.out.println("Спуск");

        }

    }
}



