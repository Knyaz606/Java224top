package HomeWork_5;

public class Task1 {
    public static void main(String[] args) {
       /* Задание 1
        Числа Фибоначчи – это последовательность чисел, в которой два первых числа последовательности равны 0 и 1, а
        каждое последующее число равно сумме двух предыдущих.
                Показать на экране все числа Фибоначчи в диапазоне оt 0 до 10 000 000.*/
        //Без интернета так и не разобрался.
        int num0 = 1;
        int num1 = 1;

        System.out.print(num0 + " " + num1 + " ");
        for(int i = 3; i <= 36; i++){
           int num2 = num0 + num1;

            System.out.print(num2 + " ");

            num0 = num1;
            num1 = num2;


        }
    }
}