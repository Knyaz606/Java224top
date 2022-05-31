package homework_2;

public class Task11 {
    public static void main(String[] args) {
        int seconds = 9586744;
        int days = (seconds / 86400);
        int hours = (seconds % 86400) / 3600;
        int minutes = ((seconds% 86400) % 3600) / 60;
        int sec = ((seconds % 86400) % 3600) % 60;;

        System.out.println(days + " Дней, " + hours + " Часов, " + minutes + " Минут, " + sec + " Секунд.");
    }
}
