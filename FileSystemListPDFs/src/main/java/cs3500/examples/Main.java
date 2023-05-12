package cs3500.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;

public class Main {
  public static void main(String[] args) throws IOException {

    ArrayList <String> myList = new ArrayList<> ();

    Path p = Path.of("sampleFiles");

    PdfFinderFileVisitor pffv = new PdfFinderFileVisitor(myList);

    Files.walkFileTree(p, pffv);

    ArrayList<String> retVal = pffv.getList();
    for (String s : retVal) {
      System.out.println(s);
    }

  }
}