import java.util.Scanner;
public class Task1 {
        public static void main(String[] args) {

            Scanner num = new Scanner(System.in);
            int chislo = 7;
            System.out.println("Угадай число:\n1\n2\n3\n4\n5\n6\n7\n8\n9\n10");
            chislo = num.nextInt();

            if (chislo == 7) {
                System.out.print("Вы угадали");
            }else if (chislo >=7) {
                System.out.print("Ваше число больше");
            } else {
                System.out.print("Ваше число меньше");


            }
        }
    }

