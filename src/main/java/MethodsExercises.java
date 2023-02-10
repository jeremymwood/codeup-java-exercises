import java.util.Scanner;

public class MethodsExercises {

//    private static String myName = "jeremy";
////    String newName = "JEREMY";
//
//    public static String sayHello(String myName) {
//        return String.format("Hello, %s!", myName);
//    }

//    public static void changeString(String s) {
//        s = "Wub a lub a dub dub";
//    }
//
//    public static void main(String[] args) {
//        String changeMe = "hello codeup!";
//
//        changeString(changeMe);
//
//        System.out.println(changeMe);
//    }
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int n = getNumOneToTen(input);
    input.close();
}


    private static int getNumOneToTen(Scanner input) {
        System.out.print("Enter number from 1 to 10: ");
        int aNumber = input.nextInt();
        if (aNumber < 1 || aNumber > 10) {
            return  getNumOneToTen(input);
        }
        System.out.println("Huzzah! " + aNumber);
        return  aNumber;
    }





}
