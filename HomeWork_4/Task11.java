package HomeWork_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {public static void main(String[] args) {


         /* Задание 11
Посчитать и вывести на консоль количество единичных
битов в числе N. Вывести на консоль исходное число в двоичном виде и результат*/

    Scanner scanner = new Scanner(System.in);
    String s = "1011110011";
    int a = 0b1011110011;
    Pattern pattern = Pattern.compile("1");
    Matcher matcher = pattern.matcher(s);
    int n = 0;
    while (matcher.find()) {
        System.out.println(matcher.group());
        n++;
    }
    System.out.println("N = " + n);
    System.out.printf("%d %s", a, Integer.toBinaryString(a));
    //Подглидел в интернете, но главное-же результат))

}
}
