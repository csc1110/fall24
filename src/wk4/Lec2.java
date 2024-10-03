package wk4;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        System.out.println("Enter a phrase. Please!");
        Scanner in = new Scanner(System.in);
        String phrase = in.nextLine();
        int letterCount = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isLetter(phrase.charAt(i))) {
                letterCount++;
            }
        }
        System.out.println("Your phrase had " + letterCount + " letters in it.");
    }
}
