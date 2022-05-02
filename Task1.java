import java.util.Scanner;
public class Task1 {
        public static void main(String[] args) {

            Scanner num = new Scanner(System.in);
            int chislo, bad = 7;
            System.out.print("Угадай число:");
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            chislo = num.nextInt();

            if (chislo == bad) {
                System.out.print("Вы угадали");
            }else if (chislo >=7) {
                System.out.print("Ваше число больше");
            } else {
                System.out.print("Ваше число меньше");


            }
        }
    }

