package homework_3;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Запешите символ");
        char symbol = sc.next(). charAt(0);

        if (symbol == '.') {
            System.out.println("Это ни то ни другое: " + ".");

        } else if (symbol >= '0' && symbol  <= '9') {
            System.out.println("Это цифра : " + symbol);

        } else if (symbol >= 'a' && symbol  <= 'z'){
            System.out.println("Это латинский символ : " + symbol);
        } else if (symbol >= 'а' && symbol  <= 'я'){
            System.out.println("Это кирилический символ : " + symbol);
        } else{
            System.out.println("Не понятный символ : " + symbol);
            sc.close();

        }
    }
}
