package wk9;

import java.util.ArrayList;
import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
        System.out.println(words.get(0));
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("there");
        words.add("out");
        System.out.println(words.lastIndexOf("out"));
        System.out.println(words);
    }
}
