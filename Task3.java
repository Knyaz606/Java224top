import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int b = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("[" + i + "]=" + a[i]);
            if (a[i] == 0) {
            } else if (a[i] % 2 == 0) {
                b++;
            }
        }
        System.out.println("\nКоличество четных чисел -" + " " + b);
            }
        }



