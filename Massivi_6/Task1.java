package Massivi_6;

public class Task1 {
    public static void main(String[] args) {
        /*Задание 1
Заполнить массив на 15 элементов числами Фибоначчи.
Вывести на консоль только четные элементы массива.*/
        int[] fib = new int[] {0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610};

        for(int i = 0; i < fib.length; i++){
            if(i%2 ==0){
                System.out.println(fib[i]);
            }
        }
    }
}

