package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

    public static String getString(){
        System.out.print("enter a string:");
        Scanner scanner = new Scanner(System.in);
        String myString = scanner.next();
        System.out.printf("your string: %s\n", myString);
        return myString;
    }

    public static boolean yesNo(){
        System.out.print("enter boolean: ");
        Scanner scanner = new Scanner(System.in);
        String myBool = scanner.next();

        if (myBool.equalsIgnoreCase("y") || myBool.equalsIgnoreCase("yes") || myBool.equalsIgnoreCase("true")) {
            System.out.printf("your boolean: true");
            return true;
        } else {
            System.out.printf("your boolean: false");
            return false;
        }
    }
}
