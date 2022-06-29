package HomeWork_5_1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int num = 10;

        for(int i = 0; i < num; i++){
            for(int j = i; j < num; j++){
                System.out.print("  ");
            }
            for(int k = 0; k < i; k++){
                System.out.print("* ");
            }
            System.out.println("  ");
        }
        System.out.println("  ");


        for(int j = 1; j < num; j++) {
            System.out.print("  ");
        }
        System.out.println("* ");

        for(int i = 1; i < num - 1; i++){
            for(int j = i + 1; j < num; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            for(int j = 1; j <= i - 1; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            System.out.println("  ");

        }
        for(int k = 0; k < num; k++){
            System.out.print("* ");
        }
    }
}

   /* int size = 10;

	    for (int i = 0; i < size; i++) {
        for (int j = 0; j < i; j++) {

        if (0 < i && i < size - 1 && 0 < j && j < i - 1) {
        System.out.print("  ");
        } else {
        System.out.print("* ");
        }
        }
        System.out.print('\n');
        }
        }
        }*/