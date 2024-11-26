package wk14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Driver {
    public static void main(String[] args) {
        Path path = Path.of(".gitignore");
        System.out.println(path.getFileName());
        System.out.println(path.getName(0));
        Path abs = path.toAbsolutePath();
        System.out.println(abs);
        try {
            List<String> lines = Files.readAllLines(path);
            System.out.println(lines.get(7));
        } catch (IOException e) {
            System.out.println("Unable to read file");
        }
    }
}
