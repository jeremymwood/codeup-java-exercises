package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);

//    public static String getString(){
//        System.out.print("enter a string:");
//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.next();
//        System.out.printf("your string: %s\n", myString);
//        return myString;
//    }

    // Get String
    public String getString(){
        return scanner.nextLine();
    }

    public String getString(String prompt){
        System.out.println(prompt);
        return getString();
    }

//    public static boolean yesNo(){
//        System.out.print("enter boolean: ");
//        Scanner scanner = new Scanner(System.in);
//        String myBool = scanner.next();
//
//        if (myBool.equalsIgnoreCase("y") || myBool.equalsIgnoreCase("yes") || myBool.equalsIgnoreCase("true")) {
//            System.out.printf("your boolean: true");
//            return true;
//        } else {
//            System.out.printf("your boolean: false");
//            return false;
//        }
//    }

    public boolean yesNo(){
        String response = getString();
        return response.equalsIgnoreCase("yes") || response.equalsIgnoreCase("true");
    }

    public boolean yesNo(String prompt){
        System.out.println(prompt);
        return yesNo();
    }

//    public static int getInt(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.printf("Enter number between %s and %s: ", min, max);
//        int userNum = scanner.nextInt();
//        if (userNum >= min && userNum <= max) {
//            if (userNum >= min && userNum <= max) {
//                System.out.printf("huzzah! %s is in range:)", userNum);
//                return userNum;
//            }
//            System.out.printf("%s is out of range, try again:/\n", userNum);
//            return getInt(min, max);
//        }
//        System.out.println("all done");
//        return userNum;

    public int getInt(){
        return scanner.nextInt();
    }


    // Get Int With Parameters
    public int getInt(int min, int max){
        System.out.println("choose a number between " + min + " and " + max);
        int myNumber = getInt();
        if (myNumber >= min && myNumber <= max) {
            System.out.println("good job");
        } else {
            return getInt(min, max);
        }
        return myNumber;
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