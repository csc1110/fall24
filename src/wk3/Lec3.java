package wk3;

import java.util.Scanner;

public class Lec3 {
    public static void main2(String[] args) {
        // Create variable to store answer
        int age = -1;
        boolean seenGoodInput = false;
        // Ask for input
        System.out.println("Enter your perceived age");
        // Create Scanner
        Scanner in = new Scanner(System.in);
        // Ask scanner if it has an int
        do {
            if (in.hasNextInt()) {
                // Yes, then read it in
                age = in.nextInt();
                seenGoodInput = true;
            } else {
                // No, clear it out, then ask again
                in.next();
                System.out.println("please focus on 0123456789 on your keyboard");
            }
        } while(!seenGoodInput);
        System.out.println("Your age in 2033 will be " + (age + 9));
        // Display their age in 2033
    }

    public static void main3(String[] args) {
        System.out.println("Enter your perceived age");
        Scanner in = new Scanner(System.in);
        while (!in.hasNextInt()) {
                in.next();
                System.out.println("please focus on 0123456789 on your keyboard");
        }
        System.out.println("Your age in 2033 will be " + (in.nextInt() + 9));
    }

    public static void main4(String[] args) {
        System.out.println("Enter a day of the week");
        Scanner in = new Scanner(System.in);
        String dayOfWeek = in.next();
        int dayOfWeekNumber = -1;
        switch (dayOfWeek) {
            case "Sun":
            case "Sunday":
                dayOfWeekNumber = 0;
                break;
            case "Monday":
                dayOfWeekNumber = 1;
                break;
            case "Tuesday":
                dayOfWeekNumber = 2;
                break;
            case "Wednesday":
                dayOfWeekNumber = 3;
                break;
            case "Thursday":
                dayOfWeekNumber = 4;
                break;
            case "Friday":
                dayOfWeekNumber = 5;
                break;
            case "Saturday":
                dayOfWeekNumber = 6;
                break;
        }
        System.out.println(dayOfWeekNumber);
    }
    public static void main(String[] args) {
        System.out.println("Enter a day of the week");
        Scanner in = new Scanner(System.in);
        String dayOfWeek = in.next();
        int dayOfWeekNumber = switch (dayOfWeek) {
            case "Sun" -> 0;
            case "Sunday" -> 0;
            case "Monday" -> 1;
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            case "Thursday" -> 4;
            case "Friday" -> 5;
            case "Saturday" -> 6;
            default -> -1;
        };
        System.out.println(dayOfWeekNumber);
    }
}





