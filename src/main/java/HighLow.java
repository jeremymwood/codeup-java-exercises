public class HighLow {
    public static void main(String[] args) {
        int myNumber = (int) (Math.random() * 100) + 1;
        int userInput;

        do {
            System.out.println("Choose a number between 1 and 100.");
            userInput = MethodsExercises.getInteger(1, 100);
            if (userInput > myNumber) {
                System.out.println("Lower");
            } else if ( userInput < myNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Nice one Rainman!");
            }
        } while (userInput != myNumber);
        System.out.println("Game over.");
    }
}