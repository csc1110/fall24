package wk3;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        {
            int i = 1;
            while (i <= 10) {
                System.out.println(i + " has a value of " + i * i + " when squared.");
                i += 1;
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " has a value of " + i * i + " when squared.");
        }
    }


}
