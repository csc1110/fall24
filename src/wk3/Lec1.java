package wk3;

import wk5.UnsignedInteger;

import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean isValid = age >= 0;
        String maybeNot =  "";
        if (!isValid) {
            System.out.println("idiot");
        } else {
            if (age < 13 || age > 19) {
                maybeNot = "not ";
            }
            System.out.println("You are " + maybeNot + "a teenager");
        }
        System.out.println(maybeNot);
    }

    public static void main2(String[] args) {
        System.out.print("Enter your age: ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        boolean isValid = age >= 0;
        if (!isValid) {
            System.out.println("idiot");
        } else if (age > 12 && age <= 19) {
            if (age == 16) {
                System.out.println("That's sweet");
            }
            System.out.println("You are a teenager");
        } else {
            System.out.println("You are not a teenager");
        }
        UnsignedInteger num = new UnsignedInteger();
        num.changeValue(3);
    }
}
