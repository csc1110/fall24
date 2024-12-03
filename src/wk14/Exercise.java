package wk14;

import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] ignored) {
        System.out.println("Enter 3 integers");
        Scanner in = new Scanner(System.in);
        int first = in.nextInt();
        int middle = in.nextInt();
        int last = in.nextInt();
        try (PrintWriter out = new PrintWriter(Files.newOutputStream(Path.of("ints.txt")))) {
            out.println(first);
            out.println(middle);
            out.println(last);
        } catch(IOException e) {
            System.out.println("Error writing to the file");
        }

    }
}
