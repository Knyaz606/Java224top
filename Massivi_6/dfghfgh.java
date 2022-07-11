package Massivi_6;

import java.util.Scanner;

public class dfghfgh {
    public static void main(String[] args) {

        String str = "синий--красный-фиолетовый-желтый---красный-----голубой----красный";

        int n = 0;
        String color = "красный";
        for (int i = 0; i < str.length(); i++) {
            int index = str.indexOf(color, n);
            if (index != n) {
                System.out.println(index);
                n = index;
            }
        }
    }
}

