package homework_2;

public class Task02 {
    public static void main(String[] args) {
        int n = 250;
        int x = n / 100;
        int y = n % 10;
        int v = n / 10;
        int b = v % 10;
        int z = x + y + b;
        System.out.println("Cуммф цифр числа n = " + z);
    }
}
