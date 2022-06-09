package homework_3;

import java.util.Scanner;

public class Task5{
    public static void main(String[] args) {

         String sign = "";
        String chineseSign = "";

        Scanner c = new Scanner (System.in);
        System.out.println("Введите день вашего рождения: ");
        int day = c.nextInt();
        System.out.println("Введите месяц вашего рождения: ");
        int month = c.nextInt();
        System.out.println("Введите год вашего рождения ");
        int year = c.nextInt();

        if((month == 1) && (day <= 20) || (month == 12) && (day >= 22)) {
            sign = "Козерог";
        } else if((month == 1) || (month == 2) && (day <= 19)) {
            sign = "Водолей";
        } else if((month == 2) || (month == 3) && (day <= 20)) {
            sign = "Рыба";
        } else if((month == 3) || (month == 4) && (day <= 19)) {
            sign = "Овен";
        } else if((month == 4) || (month == 5) && (day <= 21)) {
            sign = "Телец";
        } else if((month == 5) || (month == 6) && (day <= 21)) {
            sign = "Близнецы";
        } else if((month == 6) || (month == 7) && (day <= 23)) {
            sign = "Рак";
        } else if((month == 7) || (month == 8) && (day <= 23)) {
            sign = "Лев";
        } else if((month == 8) || (month == 9) && (day <= 23)) {
            sign = "Дева";
        } else if((month == 9) || (month == 10) && (day <= 23)) {
            sign = "Весы";
        } else if((month == 10) || (month == 11) && (day <= 22)) {
            sign = "Скорпион";
        } else if(month == 12) {
            sign = "Стрелец";
        }

        int x = (1974 - year) % 12;
        if ((x == 1) || (x == -11)){
            chineseSign="Бык";
        }
        else{
            if (x == 0){
                chineseSign = "Тигр";
            }
            else{
                if ((x == 11) || (x == -1)){
                    chineseSign = "Кролик";
                }
                else{
                    if ((x == 10) || (x == -2)){
                        chineseSign = "Дракон";
                    }
                    else{
                        if ((x == 9) || (x == -3)){
                            chineseSign = "Змея";
                        }
                        else{
                            if ((x == 8) || (x == -4)){
                                chineseSign = "Лошадь";
                            }
                            else{
                                if ((x == 7) || (x == -5)){
                                    chineseSign = "Коза";
                                }
                                else{
                                    if ((x == 6) || (x == -6)){
                                        chineseSign = "Обезьяна";
                                    }
                                    else{
                                        if ((x == 5) || (x == -7)){
                                            chineseSign = "Петух";
                                        }
                                        else{
                                            if ((x == 4) || (x == -8)){
                                                chineseSign = "Собака";
                                            }
                                            else{
                                                if ((x == 3) || (x == -9)){
                                                    chineseSign = "Свинья";
                                                }
                                                else{
                                                    if ((x == 2) || (x == -10)){
                                                        chineseSign = "Крыса";
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        System.out.println("Ваш знак зодиака " + sign + ".");
        System.out.println("Вы родились в год: " + chineseSign + ".");
    }
}