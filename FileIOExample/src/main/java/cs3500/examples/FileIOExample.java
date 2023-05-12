package cs3500.examples;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.util.Scanner;

public class FileIOExample {

    public static void main(String[] args) throws IOException {
        String fileName = "data.txt";
        writeFile(fileName);
        readFile(fileName);
    }

    /**
     * Simple function to read the contents of a text file and echo them to
     * the screen
     * @param fileName - name of the file to read.  can include relative or absolute
     *                 path
     * @throws IOException
     */
    public static void readFile(String fileName) throws IOException {
        Path p = Path.of(fileName);
        Scanner s = new Scanner(p);
        while(s.hasNext()) {
            System.out.println("  > " + s.nextLine());
        }
        s.close();

    }

    /**
     * Simple function to write sample text to a file.
     *
     * @param fileName - the name of the file to write to.  can include relative or
     *                 absolute path
     * @throws IOException
     */
    public static void writeFile(String fileName) throws IOException {
        Path p = Path.of(fileName);
        PrintWriter pw = new PrintWriter(p.toFile());
        pw.println("Writing to file line 1");
        pw.println("Writing to file line 2");
        pw.close();
    }
}