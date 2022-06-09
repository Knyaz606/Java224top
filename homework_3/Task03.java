package homework_3;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выбирете номер животного из списка:\n1 - Собака\n2 - Кошка\n3 - Кукушка\n4 - Корова\n5 - Коза\n6 - Овца \n7 - Петух\n8 - Свинья\n9 - Лошадь\n10 - Курица");
        int animals = scanner.nextInt();
        if (animals == 1) {
            System.out.println("Гав -гав-гав");
        } else if (animals == 2) {
            System.out.println("Мяу");
        } else if (animals == 3) {
            System.out.println("ку-ку");
        } else if (animals == 4) {
            System.out.println("Мууу");
        } else if (animals == 5) {
            System.out.println("Беее");
        } else if (animals == 6) {
            System.out.println("Меее");
        } else if (animals == 7) {
            System.out.println("Кукареку");
        } else if (animals == 8) {
            System.out.println("Хрю-хрю");
        } else if (animals == 9) {
            System.out.println("Иго-го");
        } else if (animals == 10) {
            System.out.println("ко-ко-ко");
        } else  {
            System.out.println("Введите верное чесло животного");

        }
    }
}
