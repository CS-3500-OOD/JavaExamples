package cs3500.examples;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Scanner Example!");

        Scanner stdinput = new Scanner(System.in);

        while (stdinput.hasNext()) {
            System.out.println("  -> You just entered > " + stdinput.next() + " <.");
        }

        stdinput.close();
    }
}