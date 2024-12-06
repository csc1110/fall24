package wk14;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        List<Double> nums = new ArrayList<>();
        try {
            readDoubles(Path.of("num.txt"), nums);
            double sum = 0;
            for (int i = 0; i < 10 && i < nums.size(); i++) {
                sum += nums.get(i);
            }
            System.out.println("Sum of the first ten numbers present: " + sum);
        } catch (FileNotFoundException e) {
            System.out.println("Not able to find the file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error encountered while reading the file. " + e.getMessage());
        }
    }

    private static void readDoubles(Path path, List<Double> list) throws IOException {
        try (Scanner in = new Scanner(Files.newInputStream(path))) {
            while(in.hasNextDouble()) {
                list.add(in.nextDouble());
            }
        }
    }
}
