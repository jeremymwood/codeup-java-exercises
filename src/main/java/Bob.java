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

            if (answerLastChar.equals("?")) {
                System.out.println("Sure.");
            } else if (answerLastChar.equals("!")) {
                System.out.println("Whoa, chill out!");

            } else if (question.equals(" ")) {
                System.out.println("Fine, be that way!");
            } else if (question.equals("bye")) {
                System.out.println("bye yourself");
                break;
            } else {
                System.out.println("Whatever.");
            }
        } while (!question.equals("bye"));

        sc.close();
    }
}
