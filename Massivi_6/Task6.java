package Massivi_6;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        /*Задание 6
        Заполнить массив на 10 элементов случайными числами
        от -10 до +10. Посчитать количество уникальных значений
        (встречающихся в массиве один раз). Вывести на консоль
        значения уникальных элементов и индексы, под которыми
        они находятся в массиве.*/

        Random rand = new Random (11);

        int[] random = new int[rand.nextInt(-10,10)];
        for (int i = 0; i < random.length; i++) {
            random[i] = rand.nextInt(-10,+10);
            boolean flag = true;

            for (int j = 0; j < random.length; j++) {
                if(random[i] == random[j] && i != j){
                    flag = false;
                    break;
                }
            }
            if(flag) {
                System.out.println(Arrays.toString(random) + i + " Идекс - " + random[i] + " Уникальное число" );
            }
        }
    }
}