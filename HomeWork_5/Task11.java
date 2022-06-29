package HomeWork_5;

public class Task11 {
    public static void main(String[] args) {
       /* Задание 10
        2520 – наименьшее число, которое можно разделить на
        каждое из чисел от 1 до 10, без остатка. Написать программу,
        которая рассчитывает наименьшее положительное число,
                которое делится на все числа от 1 до 20.*/
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0) {
                System.out.println("fizz");
            }
            if (i % 5 == 0) {
                System.out.println("buzz");
            }
            if (i % 15 == 0) {
                System.out.println("hiss");
            }
        }
    }
}

/* for (int i = 0; i < 1000; i += 3){
System.out.println("fizz");
}
for (int i = 0; i < 1000; i += 5) {
System.out.println("buzz");
}
for (int i = 0; i < 1000; i += 15) {
System.out.println("hiss.");
    }
}*/
