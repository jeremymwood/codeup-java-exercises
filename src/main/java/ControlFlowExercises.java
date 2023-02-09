import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int age = -1;
//        String name = null;
//        if (name == null) {
//            System.out.println("Invalid name");
//        } else {
//            System.out.printf("name is: %s%n", name);
//        }
//        Scanner input = new Scanner("bob");
//        String myName = "ted";
//        String otherName = input.next();

//        System.out.println(myName == otherName);
//
//        otherName = myName;
//        System.out.println(rmyName == otherName);
//
//        System.out.println(myName.equals(otherName));

//        if (myName.equals(otherName)) {
//            System.out.println("same");
//        } else {
//            System.out.println("not same");
//        }

//        switch (otherName.length()) {
//            case 1:
//                System.out.println("one long");
//                break;
//            case 2:
//                System.out.println("two long");
//                break;
//            case 3:
//                System.out.println("three long");
//                break;
//            default:
//                System.out.println("four or greater");
//                break;
//        }


//        String msg = "";
//
//        switch (otherName.length()) {
//            case 10, 11 -> msg = "long name";
//            case 2 -> {
//                msg = "short name";
//            }
//            default -> msg = "normal name";
//        }
//        System.out.println(msg);

//        input.close();

        Scanner input = new Scanner(System.in);

//        String choice = "";
//        boolean done = false;
//        do {
//            //prompt for choice
//            //prompt for choice
//            System.out.println("make a choice: ");
//
//            //get choice via scanner
//            choice = input.nextLine();
//
//            System.out.printf("you entered %s%n", choice);
//
//            //determine done
//            if (choice.equals("quit")) {
//                done = true;
//                break;
//            }
//
//        } while (!done);
//
//        for (int i = 0; i < choice.length(); i++) {
//            System.out.println(choice.charAt(i));
//        }

//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        int i = 0, n = 100;
//        do {
//            System.out.println(i);
//            i += 2;
//        } while(i <= n);

//        int i = 100, n = -10;
//        do {
//            System.out.println(i);
//            i -= 5;
//        } while(i >= n);

//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i < 1000000);

//        for (int i = 5; i <= 15; i++) {
//            System.out.print(i + " ");
//        }

//        for (int i = 0; i <= 100; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i >= -10; i -= 5) {
//            System.out.println(i);
//        }

//        for (long j = 2; j <= 1000000; j*=j) {
//            System.out.println(j);
//        }

//        for (int i = 1; i <= 100; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0) {
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else {
//                System.out.println(i);
//            }
//        }

        //plot next to all numbers
//        for (int i = 1; i <= 100; i++) {
//            System.out.print(i + ", ");
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//            }
//            if (i % 5 == 0) {
//                System.out.print("Buzz");
//            }
//            System.out.println();
//        }

//        System.out.println("enter a number: ");
//        String str = input.nextLine();
//        int squareNum = Integer.parseInt(str);
//
//        System.out.print("""
//            | number | squared | cubed |
//            | ------ | ------- | ----- |
//            """);
//        for (int i = 1; i < squareNum + 1; i++) {
//            int j = i * i;
//            int k = i * i * i;
//            System.out.printf("| %-7s| %-8s| %-5s |%n", i, j, k);
//        }

//        boolean done = false;
//        do {
//        System.out.println("enter a number: ");
//        String str = input.nextLine();
//        int squareNum = Integer.parseInt(str);
//
//        System.out.println("number | squared | cubed");
//        for (int i = 1; i < squareNum + 1; i++) {
//            int j = i * i;
//            int k = i * i * i;
//            System.out.printf("%-7s| %-8s| %-5s%n", i, j, k);
//        }
//        if (str.equals("quit")) {
//            done = true;
//            break;
//        }
//        } while (!done);


//        String choice = "";
//        boolean done = false;
//        do {
//            //prompt for choice
//            //prompt for choice
//            System.out.println("make a choice: ");
//
//            //get choice via scanner
//            choice = input.nextLine();
//
//            System.out.printf("you entered %s%n", choice);
////
//            //determine done
//            if (choice.equals("quit")) {
//                done = true;
//                break;
//            }
//
//        } while (!done);

//        System.out.println("enter a grade: ");
//        String str = input.nextLine();
//        int grade = Integer.parseInt(str);
//
//
//
//
//        if (grade <= 100 && grade >= 88) {
//            System.out.println("grade: A");
//        } else if (grade <= 87 && grade >= 80) {
//            System.out.println("grade: B");
//        } else if (grade <= 79 && grade >= 67) {
//            System.out.println("grade: C");
//        } else if (grade <= 66 && grade >= 60) {
//            System.out.println("grade: D");
//        } else if (grade <= 59 && grade >= 0) {
//            System.out.println("grade: F");
//        } else {
//            System.out.println("NOT A GRADE!");
//        }


        //doc's solution... didn't really work
//        System.out.println("enter a grade: ");
//        int str = input.nextLine();
//        input.nextLine();
//        String grade = "F";
//
//        if (str >= 88) {
//            grade = "A";
//        } else if (str >= 80) {
//            grade = "B";
//        } else if (str >= 67) {
//            grade = "C";
//        } else if (str >= 60) {
//            grade = "D";
//        }
//        System.out.println(grade);

        input.close();


//        String myName = "jeremy";
//        int age = 36;
//        String formattedAge = "" + age;
//        System.out.printf("%s is %s years old", myName, age);

        String bigString = "The quick brown fox jumps over the lazy dog.";
//        System.out.println(bigString.indexOf(" ", 4));

//        int index = -1;
//        do {
//            index = bigString.indexOf(" ", index + 1);
//            if (index > -1) {
//                System.out.printf("found a space at index %s%n", index);
//            }
//        }while (index > -1);

        System.out.println(bigString.replaceAll(" ", "|"));
        System.out.println(bigString);
    }
}
