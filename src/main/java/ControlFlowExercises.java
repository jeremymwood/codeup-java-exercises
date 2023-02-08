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
//            System.out.println("samesies");
//        } else {
//            System.out.println("not samesies");
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

//        infinite loop
//        int i = 2;
//        int n = 100000;
//        do {
//            System.out.println(i);
//            i *= i;
////            if (i > 65537) {
////                break;
////            }
//        } while(i < n);

//        for (int j = 2; j < 1000000; j*=j) {
//            System.out.println(j);
//            if (j == 65536) {
//                break;
//            }
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
//        System.out.println("number | squared | cubed");
//        for (int i = 1; i < 6; i++) {
//            int j = i * i;
//            int k = i * i * i;
//            System.out.printf("%-7s| %-8s| %-5s%n", i, j, k);
//        }

        System.out.println("enter a grade: ");
        String str = input.nextLine();
        int grade = Integer.parseInt(str);


        if (grade <= 100 && grade >= 88) {
            System.out.println("grade: A");
        } else if (grade <= 87 && grade >= 80) {
            System.out.println("grade: B");
        } else if (grade <= 79 && grade >= 67) {
            System.out.println("grade: C");
        } else if (grade <= 66 && grade >= 60) {
            System.out.println("grade: D");
        } else if (grade <= 59 && grade >= 0) {
            System.out.println("grade: F");
        } else {
            System.out.println("NOT A GRADE!");
        }

        input.close();

    }
}
