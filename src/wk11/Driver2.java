package wk11;

// Polymorphism - behavior changes based on the object that is referred to

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = -1;
        do {
            try {
                System.out.println("Please enter your weight in lbs");
                weight = in.nextInt();
                System.out.println("Thank you for entering an integer value");
            } catch(InputMismatchException exception) {
                in.nextLine();
                System.out.print("To the nearest integer value... ");
            }
        } while(weight<0);
    }

    public static void main3(String[] args) {
        A aaaa = new C();
        aaaa.dump();
    }




    public static void main2(String[] args) {
        Shape shape = new Shape();
        Circle circle = new Circle();
        Shape circular = new Circle();
        System.out.println("" + shape.toString() + circle);
        System.out.println(circular.toString());
    }
}
