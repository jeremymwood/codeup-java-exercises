package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter a string:");
        String myString = scanner.next();
        System.out.printf(Input.getString(myString));


    }
}