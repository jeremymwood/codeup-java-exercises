import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f.\n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.print("enter a integer: ");
//        int anInt = input.nextInt();
//        System.out.println("your integer is: " + anInt);

        System.out.println("enter first word: ");
        String firstWord = input.next();
//        System.out.println("first word: " + firstWord);

        System.out.println("enter second word: ");
        String secondWord = input.next();
//        System.out.println("second word: " + secondWord);

        System.out.println("enter third word: ");
        String thirdWord = input.next();
//        System.out.println("third word: " + thirdWord);
        System.out.printf("words: %s, %s, %s", firstWord, secondWord, thirdWord);
    }

}