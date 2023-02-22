package util;

import java.util.Scanner;

public class Input {
    private final Scanner scanner = new Scanner(System.in);


    public String getString(){
//        System.out.print("enter a string:");
        String string = scanner.nextLine();
//        System.out.printf("your string: %s\n", string);
        return string;
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }
//    public String getString(String string){
////        System.out.print("Enter a number: ");
////        int userNum = scanner.nextInt();
////        System.out.printf("huzzah! your int is %s.)", userNum);
////        return userNum;
//        return scanner.nextLine();
//    }


    public boolean yesNo() {
//        System.out.print("enter boolean: ");
        String myBool = scanner.nextLine();
        if (myBool.equalsIgnoreCase("y") || myBool.equalsIgnoreCase("yes") || myBool.equalsIgnoreCase("true")) {
//            System.out.printf("your boolean, %s, is true", myBool);
            return true;
        }
            return false;
    }
    public boolean yesNo(boolean prompt) {
        System.out.println(prompt);
        return yesNo();
    }

//    public static int getInt(int min, int max) {
//        System.out.printf("Enter number between %s and %s: ", min, max);
//        int userNum = scanner.nextInt();
//        if (userNum >= min && userNum <= max) {
//                System.out.printf("huzzah! %s is in range:)", userNum);
//                return userNum;
//            } else {
//            System.out.printf("%s is out of range, try again:/\n", userNum);
//            return getInt(min, max);
//            }
//    }

//    public static int getInt(){
////        System.out.print("Enter a number: ");
////        int userNum = scanner.nextInt();
////        System.out.printf("huzzah! your int is %s.)", userNum);
////        return userNum;
//        return scanner.nextInt();
//    }

    public int getInt(){
//        return sc.nextInt();
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.parseInt(s);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter; ");
            userInt = getInt();
        }

        return userInt;
    }
    public int getInt(int prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max, String string){
//        System.out.println("choose a number between " + min + " and " + max);
        int myNumber = getInt();
        if (myNumber >= min && myNumber <= max) {
//            System.out.println("good job");
//            return myNumber;
        } else {
            return getInt(min, max, "try again");
        }
        return myNumber;
    }

    public double getDouble(){
        System.out.print("Enter a number: ");
        double userNum = scanner.nextDouble();
//        System.out.printf("huzzah! your double is %s.", userNum);
        return userNum;
    }
    public double getDouble(double prompt) {
        System.out.println(prompt);
        return getDouble();
    }

    public double getDouble(double min, double max) {
        System.out.printf("Enter number between %s and %s: ", min, max);
        Double userNum = scanner.nextDouble();
        if (userNum >= min && userNum <= max) {
//            System.out.printf("huzzah! %s is in range:)", userNum);
            return userNum;
        } else {
            System.out.printf("%s is out of range, try again:/\n", userNum);
            return getDouble(min, max);
        }
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

    public int getHex() {
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.valueOf(s, 16);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter; ");
            userInt = getHex();
        }

        return userInt;
    }

    public int getBinary() {
        int userInt = 0;

        String s = getString();

        try {
            userInt = Integer.valueOf(s, 2);

        } catch (NumberFormatException e) {
            System.out.println("Invalid Integer. Please re-enter; ");
            userInt = getHex();
        }

        return userInt;
    }

    }