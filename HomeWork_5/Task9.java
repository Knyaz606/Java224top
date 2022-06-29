package HomeWork_5;

public class Task9 {
    public static void main(String[] args) {
       /* Задание 9
        Если перечислить все натуральные числа меньше 10, кратные 3 или 5, мы получаем 3, 5, 6 и 9. Сумма этих кратных – 23.
        Найдите сумму всех чисел, кратных 3 или 5, начиная с 0
        и до 1 000.*/

            int num = 1000;
            for (int i = 0; i < num; i++){
                if ((i % 3 ==0) && (i % 5 == 0)){

                    System.out.println(i);
                }
            }
        }
    }

