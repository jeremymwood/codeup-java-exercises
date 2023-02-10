import java.time.chrono.MinguoDate;
import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        String question;

        System.out.println("Do you have a question for Bob?");

        do
        {
            question = sc.nextLine();

            int targetIndex = question.length() -1;
            String answerLastChar = String.valueOf(question.charAt(targetIndex));

            if (question.indexOf("?") > -1) {
                System.out.println("Bob: Sure.");
            }

//            if (answerLastChar.equals("?")) {
//                System.out.println("Bob: Sure.");
//            }
            else if (answerLastChar.equals("!")) {
                System.out.println("Bob: Whoa, chill out!");

            } else if (question.equals(" ")) {
                System.out.println("Bob: Fine, be that way!");
            } else if (question.equals("bye")) {
                System.out.println("Bob: bye yourself");
                break;
            } else {
                System.out.println("Bob: Whatever.");
            }
        } while (!question.equals("bye"));

        sc.close();
    }
}
