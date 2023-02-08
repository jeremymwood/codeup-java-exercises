import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int age = -1;
//        String name = null;
//        if (name == null) {
//            System.out.println("Invalid name");
//        } else {
//            System.out.printf("name is: %s%n", name);
//        }
        Scanner input = new Scanner("bob");
        String myName = "ted";
        String otherName = input.next();

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

        input.close();

        input = new Scanner(System.in);

        String choice = "";
        boolean done = false;
        do {
            //prompt for choice
            //prompt for choice
            System.out.println("make a choice: ");

            //get choice via scanner
            choice = input.nextLine();

            System.out.printf("you entered %s%n", choice);

            //determine done
            if (choice.equals("quit")) {
                done = true;
                break;
            }

        } while (!done);

        for (int i = 0; i < choice.length(); i++) {
            System.out.println(choice.charAt(i));
        }


        input.close();

    }
}
