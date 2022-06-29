package HomeWork_5_1;

public class Task3 {
    public static void main(String[] args) {
        int num = 10;

        for (int i = 0; i < num; i++) {
            for (int a = 0; a <= num; a++) {
                int x = num - i;

                if (a > x) {
                    if (x == (a - 1) || i == (num - 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    System.out.print(" ");
                }
            }
            for (int b = 0; b <= i; b++) {
                if (b == i || i == (num - 1)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("\n");
        }

        for (int i = 0; i <= num; i++){
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            for (int j1 = 0; j1 <= i; j1++){
                System.out.print("*");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            for (int j = num; j > i; j--){
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
}
