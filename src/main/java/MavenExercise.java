import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    private static final Scanner scanner = new Scanner(System.in);
    private static void response() {
        System.out.print("Enter Something: ");
        String response = scanner.nextLine();
        System.out.printf("You entered: \"%s\"\n", response);
        if (StringUtils.isNumeric(response)) {
            System.out.printf("\"%s\" is a number.\n", response);
        } else {
            System.out.printf("\"%s\" is NOT a number.\n", response);
        }
        System.out.printf("Flipped Case: %s\n", StringUtils.swapCase(response));
        System.out.printf("Reversed: %s\n", StringUtils.reverse(response));
    }

    public static void main(String[] args) {
        response();
    }
}
