package wk4;

import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        System.out.println("Enter an angle in degrees");
        Scanner in = new Scanner(System.in);
        double angle = in.nextDouble();
        System.out.println(Math.sin(Math.toRadians(angle)));
        System.out.println(Math.pow(3, 2));
        Integer i = 2;
    }
}
