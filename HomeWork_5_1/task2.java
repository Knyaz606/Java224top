package HomeWork_5_1;

public class task2 {
    public static void main(String[] args) {
        int num = 10;

        for(int j = 0; j < num + 2; j++){
            System.out.print("* ");
        }
        System.out.println("  ");

        for(int i = 0; i < num + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }

            System.out.print("* ");

            for(int j = i; j < num; j++){
                System.out.print("  ");
            }
            System.out.println("* ");
        }
        System.out.println("  ");


        for(int i = 0; i < num; i++){
            for(int j = 0; j < i; j++){
                System.out.print("  ");
            }

            for(int j = i; j < num; j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}