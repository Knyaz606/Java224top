public class Task2 {
    public static void main(String[] args) {

        int[] a = new int[] {2,4,6,8,10};
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i + " ");
            if (i == 10) {
                System.out.println();
            }
        }

        for (int i = 2; i <= 10; i = i + 2) {
            System.out.println(i);
        }
    }
}