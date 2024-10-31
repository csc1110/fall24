package wk9;

import java.util.ArrayList;
import java.util.List;

public class Driver2 {
    public static void main2(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("hello");
//        System.out.println(words.get(0));
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("out");
        words.add("there");
        words.add("out");
//        System.out.println(words.lastIndexOf("out"));
//        System.out.println(words);
        String bigGal = "";
//        for (int i = 0; i < words.size(); i++) {
//            String word = words.get(i);
        for (String word : words) {
            bigGal += word;
        }
        System.out.println(bigGal);
//        for (char x : "this doesn't work, or I'm goint to look bad, and reveal I can't spell goint") {
//
//        }
    }

    public static void main(String[] args) {
        ArrayList<Double> quiz = new ArrayList<>();
        //quiz.add(4); //why no like?
        quiz.add(4.0);
        ArrayList<Integer> stuff = new ArrayList<>();
        for (int i = 789; i < 987; i++) {
            stuff.add(i);
        }
        System.out.println(stuff);
        System.out.println(reverse(stuff));
    }

    private static ArrayList<Integer> reverse2(ArrayList<Integer> nums) {
        ArrayList<Integer> backwards = new ArrayList<>();
        for (Integer num : nums) {
            backwards.add(0, num);
        }
        return backwards;
    }

    private static ArrayList<Integer> reverse(ArrayList<Integer> nums) {
        ArrayList<Integer> backwards = new ArrayList<>();
        for (int i = nums.size() - 1; i >= 0; --i) {
            backwards.add(nums.get(i));
        }
        return backwards;
    }
}
