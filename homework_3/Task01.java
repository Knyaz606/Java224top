package homework_3;

import java.util.Scanner;

public class Task01 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер недели от 1 до 7 :");
        int numberWeek = scanner.nextInt();
       switch(numberWeek){
           case 1 :
               System.out.println("Понедельник");
               break;
           case 2 :
               System.out.println("Вторник");
               break;
           case 3 :
               System.out.println("Среда");
               break;
           case 4 :
               System.out.println("Четверк");
               break;
           case 5 :
               System.out.println("Пятница");
               break;
           case 6 :
               System.out.println("Субота");
               break;
           case 7 :
               System.out.println("Воскресенье");
               break;

       }

    }
}



