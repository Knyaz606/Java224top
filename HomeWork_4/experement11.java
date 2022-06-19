package HomeWork_4;

import java.util.Scanner;

public class experement11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("Выбирите число  до 1999 для подсчета единичных битов: ");

        int n = scanner.nextInt();
        System.out.printf("%d -> %36s\n", n, Integer.toBinaryString(n));
        int i = 0, i1 = 1, i2 = 2, i3 = 3, i4 = 4, i5 = 5, i6 = 6, i7 = 7, i8 = 8, i9 = 9, i10 = 10;
        int rez0 =(n >> i) & 1;
        int rez1 =(n >> i1) & 1;
        int rez2 =(n >> i2) & 1;
        int rez3 =(n >> i3) & 1;
        int rez4 =(n >> i4) & 1;
        int rez5 =(n >> i5) & 1;
        int rez6 =(n >> i6) & 1;
        int rez7 =(n >> i7) & 1;
        int rez8 =(n >> i8) & 1;
        int rez9 =(n >> i9) & 1;
        int rez10 =(n >> i10) & 1;

        int rezyltat = rez0 + rez1 + rez2 + rez3 + rez4 + rez5 + rez6 + rez7 + rez8 + rez9 + rez10;
        System.out.println("Битовых едениц в числе " + n  + " = " + rezyltat);

    }

}
