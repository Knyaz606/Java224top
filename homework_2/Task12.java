package homework_2;

public class Task12 {
    public static void main(String[] args) {

        int n = 425;
        double milk = 0.200;
        int perog = 425;
        perog *= 2;
        double pacet = n * milk;
        System.out.println("Если 100% учеников весят менше 30кг. То перожков нужно " + perog +" шт. и " + Math.round(pacet) + " Пакета молока.");

        perog = (perog * 60) / 100;
        pacet = (pacet * 60) /100;
        System.out.println("Если 60% учеников весят менше 30кг. То перожков нужно " + perog +" шт. и " + Math.round(pacet) + " Пакета молока.");

        perog = (perog * 1) / 100;
        pacet = (pacet * 1) /100;
        System.out.println("Если 60% учеников весят менше 30кг. То перожков нужно " + perog +" шт. и " + Math.round(pacet) + " Пакета молока.");

        }
}
