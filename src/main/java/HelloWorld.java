import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        //the program starts executing here
//        System.out.println("Hello world");
//        System.out.print("Hello world1\n");
//        System.out.println("Hello world2");

//    byte myByte = 127;
//    myByte += 1;
//        System.out.println(myByte);


//    declare then init var
//    String anotherString;
//    anotherString = "another string";

//    declare and init variable to print
//    String myString = "string1";
//    System.out.println(myString);


//        int myFavoriteNumber = 7;
//        System.out.println(myFavoriteNumber);
//
//        String myString = "harmony";
//        System.out.println(myString);
//
//        double pi = 3.14159;
//        float myNumber = (float) pi;
//
//        System.out.println(myNumber);
//
//
//        int x = 5;
//        System.out.println(x);
////        print and then increment
//        System.out.println(x++);
//        System.out.println(x);
//
//        int x = 5;
//        increment and the print
//        System.out.println(++x);
//        System.out.println(x);

//        String class;
//        System.out.println(class);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
////        int three = (int) o;
//        int three = (int) "three";

//        int xAgain = 4;
////        xAgain = xAgain + 5;
//        xAgain += 5;
//        System.out.println(xAgain);

//        int x3 = 3;
//        int y = 4;
////        y = y * x3;
//        y *= x3;
//        System.out.println(y);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//        y *= x;
//        System.out.println(y);

//        int x4 = 10;
//        int y = 2;
////        x4 = x4 / y;
//        x4 /= y;
////        y = y - x4;
//        y -= x4;
//
//        System.out.println(y);

//        String myName = "Jeremy";
//
//        byte myByte = 127;
//        System.out.println(myByte);


//        System.out.printf("hello %n");
//        System.out.printf("hey there  %s, %05d", myName, myByte);

        Scanner input = new Scanner(System.in);

        System.out.print("enter your name: ");
//        single token
//        String aName = input.next();
//        multi token
        String aName = input.nextLine();
        System.out.println("your name is: " + aName);

        System.out.print("enter age: ");
        int age = input.nextInt();
        System.out.println("your name is " + aName + " and your age is " + age + ".");



//        System.out.println("your name is " + aName);

        input.close();




    }
}