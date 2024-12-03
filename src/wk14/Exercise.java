package wk14;

import java.io.DataOutputStream;
import java.io.IOError;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] ignored) {
        System.out.println("Enter 3 doubles");
        Scanner in = new Scanner(System.in);
        double first = in.nextDouble();
        double middle = in.nextDouble();
        double last = in.nextDouble();
        try (DataOutputStream out = new DataOutputStream(Files.newOutputStream(Path.of("doubles.bin")))) {
            out.writeDouble(first);
            out.writeDouble(middle);
            out.writeDouble(last);
        } catch(IOException e) {
            System.out.println("Error writing to the file");
        }

    }
}
