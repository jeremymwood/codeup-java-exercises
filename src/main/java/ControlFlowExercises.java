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
        String myName = "bob";
        String otherName = input.next();

        System.out.println(myName == otherName);

        otherName = myName;
        System.out.println(myName == otherName);


    }
}
