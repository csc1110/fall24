package wk14;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.zip.ZipInputStream;

public class Driver {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("file.txt");
        writeDouble(path, 1.1);
        writeDouble(path, 1.2);
        writeDouble(path, 1.3);
        writeDouble(path, 1.4);
        writeDouble(path, 1.5);
        System.out.println(readDouble(path));
    }

    public static void writeDouble(Path path, double data) throws IOException {
        OutputStream out = Files.newOutputStream(path, StandardOpenOption.APPEND);
        DataOutputStream dOut = new DataOutputStream(out);
        dOut.writeDouble(data);
        dOut.writeChars("happy");
    }
    public static double readDouble(Path path) throws IOException {
        try (DataInputStream in = new DataInputStream(new
                BufferedInputStream(new ZipInputStream(Files.newInputStream(path))))) {
            return in.readDouble();
        }
    }
}
