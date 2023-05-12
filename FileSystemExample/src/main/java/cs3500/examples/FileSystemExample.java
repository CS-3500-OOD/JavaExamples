package cs3500.examples;

import java.io.IOException;
import java.nio.file.*;

public class FileSystemExample
{
    public static void main(String[] args) throws IOException {
        System.out.print("Walking the FileSystem...");

        Path startingDirectory = Path.of("sampleFiles/");

        FileTreeWalkerVisitor pf = new FileTreeWalkerVisitor();
        Files.walkFileTree(startingDirectory, pf);
    }

}




/**
 * Example to walk the file system recursively starting at a particular directory
 *
 * Based on https://docs.oracle.com/javase/tutorial/essential/io/walk.html
 */


//public class FileSystemExample
//{
//    public static void main(String[] args) throws IOException {
//        System.out.print("Walking the FileSystem...");
//
//        //Note that the path given here is relative to this module's working directory
//        //set in the build.gradle (that is inside the FileSystemsExample folder)
//        //If you want to start at some other folder, provide an absolute path
//        Path startingDirectory = Path.of("sampleFiles/");
//
//        //FileTreeWalkerVisitor implements the FileVisitor<T> interface
//        //walkFileTree automatically performs a recursive descent through the file system
//        //using the methods of FileTreeWalkerVisitor as callbacks for processing
//        FileTreeWalkerVisitor pf = new FileTreeWalkerVisitor();
//        Files.walkFileTree(startingDirectory, pf);
//    }
//
//}