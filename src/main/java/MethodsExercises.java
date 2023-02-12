import java.util.Scanner;
import java.lang.Math;


public class MethodsExercises {
//    private static String myName;
//
//    public static String sayHello(String name) {
//        return String.format("Hello, %s!", name);
//    }
//
//    public static String sayHello() {
//        return String.format("Hello there!");
//    }
//
//    public static String sayHello(int numRepeats) {
//        String str = "";
//        for (int i = 0; i < numRepeats; i++) {
//            str += sayHello() + "!!\n";
//        }
//        return str;
//    }
//
//    public static void main(String[] args) {
//
//        // technical diff between method and function
//
//        // create a sayHello method with a string param
//        // point out the parts of method signature
//        // remind students of difference in DEFINING and CALLING a method
//        System.out.println(sayHello("Bob"));
//        System.out.println(MethodsExercises.sayHello());
//        System.out.println(MethodsExercises.sayHello(2));
//
//        // overload with a sayHello method with no parameters
//        // introduce NO ARG term
//
//        // overload with an int to print hello a number of times
//        // show reuse by calling the no arg version
//
//        // talk about passing by value and how to change a parameter's value OUTSIDE of the function
//        // demo string changeMe function
//        // 2 ways to change outside variable:
//        // 1. pass it contained in an object (WILL SHOW NEXT WEEK)
//        // 2. or make it global (show the static shuffle) and advise to be careful
//        myName = "jimbob";
//        changeMyName(myName, "bob");
//        System.out.println(myName);
//
//        myName = makeNewName("bob");
//
//        // fun with recursion!
//        // briefly go over codeup's count example
//        // BRIEFLY use my fun w recursion slides to talk in more depth
//        // maybe show my fibonacci examples
//        Scanner input = new Scanner(System.in);
//        int n = getNumberFromOneTo10(input);
//
//        input.close();
//    }
//
//
//    private static String makeNewName(String newName) {
//        return newName;
//    }
//
//    private static void changeMyName(String oldName, String newName) {
//        myName = newName;
//        System.out.println("oldName is now " + myName);
//    }
//
//    private static int getNumberFromOneTo10(Scanner input) {
//        System.out.print("Enter number from 1 to 10: ");
//        int aNumber = input.nextInt();
//        if(aNumber < 1 || aNumber > 10) {
//            return getNumberFromOneTo10(input);
//        }
//        // otherwise you did it right so return it
//        return aNumber;
//    }



//   public class FibonacciRecursive {
//    /*
//    f(n) = f(n-1) + f(n-2)
//     */
//    public static long fib(int n) {
//        if(n == 0) {
//            return 0;
//        }
//        if(n == 1) {
//            return 1;
//        }
//        return fib(n - 1) + fib(n - 2);
//    }
//
//    public static void main(String[] args) {
//        long start = System.currentTimeMillis();
//        System.out.println(fib(50));
//
//        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
//    }
//}

//
//        System.out.println("Time in ms = " + (System.currentTimeMillis() - start));
//    }

    public static int addition(int num1, int num2) {
        System.out.printf("addition: %s + %s = ", num1, num2);
        return num1 + num2;
    }
    public static int subtraction(int num1, int num2) {
        System.out.printf("subtraction: %s - %s = ", num1, num2);
        return num1 - num2;
    }
    public static int multiplication(int num1, int num2) {
        System.out.printf("multiplication: %s * %s = ", num1, num2);
        return num1 * num2;
    }
    public static double division(int num1, int num2) {
        double q = (double) num1 / num2;
        System.out.printf("division: %s / %s = ", num1, num2);
        return q;
    }
    public static int modulus(int num1, int num2) {
        System.out.printf("modulus: %s / %s = ", num1, num2);
        return num1 % num2;
    }

    public static int getInteger(Scanner input) {
    System.out.print("Enter number from 1 to 10: ");
    int aNumber = input.nextInt();
    if(aNumber < 1 || aNumber > 10) {
        return getInteger(input);
    }
    System.out.printf("huzzah! %s is a decad number!", aNumber);
    return aNumber;
    }

    public static int factorial(Scanner input) {
        System.out.print("Enter number from 1 to 10: ");
        int aNumber = input.nextInt();
        int factorialNum = 1;
        if(aNumber < 1 || aNumber > 10) {
            return factorial(input);
        }
        for (int i = 1; i <= aNumber; i++) {
             factorialNum *= i;
        }
//            return factorialNum;
        System.out.printf("The factorial of %s is: %s", aNumber, factorialNum);
        return aNumber;
    }


    public static int diceRoller(Scanner input) {
        System.out.print("Enter the number of sides for your pair of dice: ");
        int aNumber = input.nextInt();
        int min = 1;
        int max = aNumber;
        int range = max - min + 1;

        int roll1 = (int) (Math.random() * range) + min;
        int roll2 = (int) (Math.random() * range) + min;
        System.out.printf("Your D%s roll is %s and %s", aNumber, roll1, roll2);
        return aNumber;
    }

    public static int HighLow(Scanner input) {
        System.out.print("Guess my number: ");
        int aNumber = input.nextInt();
        int min = 1;
        int max = 100;
        if(aNumber < min || aNumber > max) {
            return HighLow(input);
        }
        int result = (int) (Math.random() * max) + min;

        if (aNumber > result) {
            System.out.println("LOWER");
            System.out.printf("Result: %s, Guess: %s", result, aNumber);
            return aNumber;
        }
        if (aNumber < result) {
            System.out.println("HIGHER");
            System.out.printf("Result: %s, Guess: %s", result, aNumber);
            return aNumber;
        }
        if (aNumber == result) {
            System.out.println("GOOD GUESS RAINMAN!");
            System.out.printf("Result: %s, Guess: %s", result, aNumber);
            return aNumber;
        }
        return aNumber;
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//        System.out.println(addition(10,4));
//        System.out.println(subtraction(10,4));
//        System.out.println(multiplication(10,4));
//        System.out.println(division(17,0));
//        System.out.println(modulus(10,4));

//        getInteger(input);
//        factorial(input);
//        diceRoller(input);
//        HighLow(input);

    }





}



