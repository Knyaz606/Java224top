package homework_2;

public class Task07 {
    public static void main(String[] args) {
        int years = 2; //сколько лет вклада
        int deposit_amount = 30000; //сумма вклада
        int annual_percentage = 15; //годовой процент
        int contribution = (deposit_amount * annual_percentage / 100) * 2; // сумма вклад через 2 года
        System.out.println(contribution); // вывод
    }
}
