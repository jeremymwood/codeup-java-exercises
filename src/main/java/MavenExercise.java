import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

public class MavenExercise {
    private static final Scanner scanner = new Scanner(System.in);
    public static String reverseString(String str) {
        StringBuilder nstr = new StringBuilder();
        char ch;
        for (int i=0; i<str.length(); i++) {
            ch= str.charAt(i);
            nstr.insert(0, ch);
        }
        return nstr.toString();
    }
public static String reverseCase(String text) {
    char[] chars = text.toCharArray();
    for (int i = 0; i < chars.length; i++) {
        char c = chars[i];
        if (Character.isUpperCase(c))
        {
            chars[i] = Character.toLowerCase(c);
        }
        else if (Character.isLowerCase(c))
        {
            chars[i] = Character.toUpperCase(c);
        }
    }
    return new String(chars);
}
    private static void response() {
        System.out.print("Enter Something: ");
        String response = scanner.nextLine();
        System.out.printf("You entered: \"%s\"\n", response);
        if (StringUtils.isNumeric(response)) {
            System.out.printf("\"%s is a number.\"", response);
        }
        System.out.printf("\"%s\" is NOT a number.\n", response);
        System.out.printf("Flipped Case: %s\n", reverseCase(response));
        System.out.printf("Reversed: %s\n", reverseString(response));
    }

    public static void main(String[] args) {
        response();
    }
}
