package HomeWork_5;

public class Task3 {
    public static void main(String[] args) {
        /*Задание 3
        Самовлюблённое число или число Армстронга – натуральное число, которое равно сумме своих цифр, возведенных
        в степень, равную количеству его цифр.
                Показать на экране все числа Армстронга в диапазоне от
        10 до 1 000 000.
        Например:
        153 = 1^3 + 5^3 + 3^3*/

       for (int i = 10; i < 10000; ) {
            int s, b, b1, b2, s1, s2, v;
            b = (i % 10);
            b1 = i / 10 % 10;
            b2 = i / 100 % 10;
            s = b * b * b;
            s1 = b1 * b1 * b1;
            s2 = b2 * b2 * b2;
            v = s + s1 + s2;

            if (i == v)
                System.out.println(v);
            i++;
        }
        for (int i = 1000; i < 100000; ) {
            int s, b, b1, b2, s1, s2, s3, v, b3;

            b = (i % 10);
            b1 = i / 10 % 10;
            b2 = i / 100 % 10;
            b3 = i / 1000 % 10;

            s = b * b * b * b;
            s1 = b1 * b1 * b1 * b1;
            s2 = b2 * b2 * b2 * b2;
            s3 = b3 * b3 * b3 * b3;
            v = s + s1 + s2 + s3;

            if (i == v)
                System.out.println(v);
            i++;
        }
        for (int i = 10000; i < 1000000; ) {
            int s, b, b1, b2, s1, s2, s3, s4, v, b3, b4;

            b = (i % 10);
            b1 = i / 10 % 10;
            b2 = i / 100 % 10;
            b3 = i / 1000 % 10;
            b4 = i / 10000 % 10;

            s = b * b * b * b * b;
            s1 = b1 * b1 * b1 * b1 * b1;
            s2 = b2 * b2 * b2 * b2 * b2;
            s3 = b3 * b3 * b3 * b3 * b3;
            s4 = b4 * b4 * b4 * b4 * b4;
            v = s + s1 + s2 + s3 + s4;

            if (i == v)
                System.out.println(v);
            i++;
        }
    }
}


