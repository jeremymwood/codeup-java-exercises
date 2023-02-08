import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner input = new Scanner(System.in);

//        System.out.print("enter a integer: ");
//        int anInt = input.nextInt();
//        System.out.println("your integer is: " + anInt);

//        System.out.print("enter three words: ");
//        String firstWord = input.next();
//        String secondWord = input.next();
//        String thirdWord = input.next();
////        string, next, string, next...
//        System.out.printf("%s%n%s%n%s%n", firstWord, secondWord, thirdWord);

//        System.out.println("enter a sentence: ");
//        String sentence = input.nextLine();
//        System.out.println(sentence);

//        System.out.println("enter room's width: ");
//        String str = input.nextLine();
//        int roomWidth = Integer.parseInt(str);
//
//        System.out.println("enter room's length: ");
//        String str2 = input.nextLine();
//        int roomLength = Integer.parseInt(str2);
//
//        Integer area = roomWidth * roomLength;
//        Integer perimeter = (2 * roomWidth) + (2 * roomLength);
//
//        System.out.printf("area: %s square feet%n", area);
//        System.out.printf("perimeter: %s linear feet%n", perimeter);
//
//        System.out.println("enter room's height: ");
//        String str3 = input.nextLine();
//        int roomHeight = Integer.parseInt(str3);
//        Integer volume = roomWidth * roomLength * roomHeight;

//        System.out.printf("""width: %s feet%nlength: %s feet%n height: %s feet%n volume: %s cubic feet""", str, str2, str3, volume);

        input.close();


        double money = .1;
        System.out.println(money);
        System.out.println(money);

        money += .1;
        System.out.println(money);

        money += .1;
        System.out.println(money);


//        for (int i = 0; i < 10; i++) {
//            if(i % 2 == 1) { //              |
//                continue; // ----------------+
//            }
//            System.out.println(i);
//        }

    }

}
