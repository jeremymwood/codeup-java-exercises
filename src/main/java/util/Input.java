package util;

import java.util.Scanner;

public class Input {
    private static Scanner scanner = new Scanner(System.in);


    public static String getString(){
        System.out.print("enter a string:");
        String string = scanner.nextLine();
        System.out.printf("your string: %s\n", string);
        return string;
    }

    public static boolean yesNo() {
        System.out.print("enter boolean: ");
        String myBool = scanner.nextLine();
        if (myBool.equalsIgnoreCase("y") || myBool.equalsIgnoreCase("yes") || myBool.equalsIgnoreCase("true")) {
            System.out.printf("your boolean, %s, is true", myBool);
            return true;
        } else {
            System.out.printf("your boolean, %s, is false. try again\n", myBool);
            return yesNo();
        }
    }

    public static int getInt(int min, int max) {
        System.out.printf("Enter number between %s and %s: ", min, max);
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
                System.out.printf("huzzah! %s is in range:)", userNum);
                return userNum;
            } else {
            System.out.printf("%s is out of range, try again:/\n", userNum);
            return getInt(min, max);
            }
    }

    public static int getInt(){
        System.out.print("Enter a number: ");
        int userNum = scanner.nextInt();
        System.out.printf("huzzah! your int is %s.)", userNum);
        return userNum;
    }

//            int myNumber = (int) (Math.random() * 100) + 1;
//            int userInput;
//
//            do {
//                System.out.println("Choose a number between 1 and 100.");
//                userInput = getInt(1, 100);
//                if (userInput > myNumber) {
//                    System.out.println("Lower");
//                } else if ( userInput < myNumber) {
//                    System.out.println("Higher");
//                } else {
//                    System.out.println("Nice one Rainman!");
//                }
//            } while (userInput != myNumber);
//            System.out.println("Game over.");

//        public double getCircumference() {
//            return Math
//        }

    }