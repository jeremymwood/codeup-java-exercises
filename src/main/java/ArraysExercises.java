import playtime.Fighter;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {


//    public static String[] addX(int n, String[] arr, String x)
//    {
//        int i;
//
//        // create a new array of size n+1
//        String[] newarr = new String[n + 1];
//
//        // insert the elements from
//        // the old array into the new array
//        // insert all elements till n
//        // then insert x at n+1
//        for (i = 0; i < n; i++)
//            newarr[i] = arr[i];
//
//        newarr[n] = x;
//
//        return newarr;
//    }
    public static String[] addPerson(String personName, int n, String arr[]) {
        int i;
        String newArr[] = new String[n + 1];
        for (i = 0; i < n; i++) {
            newArr[i] = arr[i];
            newArr[n] = personName;
        }
            return newArr;
    }

//    public static int factorial(Scanner input) {
//        System.out.print("Enter number from 1 to 10: ");
//        int aNumber = input.nextInt();
//        int factorialNum = 1;
//        if(aNumber < 1 || aNumber > 10) {
//            return factorial(input);
//        }
//        for (int i = 1; i <= aNumber; i++) {
//            factorialNum *= i;
//        }
////            return factorialNum;
//        System.out.printf("The factorial of %s is: %s\n", aNumber, factorialNum);
//        return aNumber;
//    }

//            String[] Person = {"Matthew", "Rosie", "Nikki"};
//        for (int i = 0; i < Person.length; i++) {
//        System.out.println(Person[i]);
//    }

    public static void main(String[] args) {
//        int [] ages;
//
//        //must be same data type specified
//        ages = new int[4];
//
//        //memory address
//        System.out.println(ages);
//
//        //static sout helper method
//        //int fills zeros by default
//        System.out.println(Arrays.toString(ages));
//
//        //define index
//        ages[0] = 42;
//        System.out.println(Arrays.toString(ages));
//
//        //define index
//        ages[3] = 36;
//        System.out.println(Arrays.toString(ages));
//
//        //out of bounds wont run
////        ages[4] = 36;
////        System.out.println(Arrays.toString(ages));
//
//        //redefine and now works, previous values lost
//        //arrays are inflexible and better used for things that never change, ie days of the week
//        ages = new int[12];
//        ages[4] = 57;
//        System.out.println(Arrays.toString(ages));
//
//
////        set array values from prompt
////        Input input = new Input();
////        System.out.println("how many elements?");
////        int arrayLength = input.getInt();
////        ages = new int[arrayLength];
////
////        ages[11] = 24;
////        System.out.println(Arrays.toString(ages));
//
//        String [] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//        System.out.println(Arrays.toString(daysOfWeek));
//
//        //loops
////        for (int i = 0; i < daysOfWeek.length; i++) {
////            System.out.println(daysOfWeek[i]);
////            //can set attributes in loop too
//////            daysOfWeek[i] = "blah";
//////            System.out.println(daysOfWeek[i]);
////        }
//        //for each
//        for (String day: daysOfWeek) {
//            System.out.println(day);
////            day = "blah";
////            System.out.println(day);
//        }
////        Arrays.fill(daysOfWeek, "blah");
////        System.out.println(Arrays.toString(daysOfWeek));
//
//
//        String [] otherArr = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
//
//        //unique arrays
//        System.out.println(daysOfWeek == otherArr);
//        //element values
//        System.out.println(Arrays.equals(daysOfWeek, otherArr));
//
//
//        //copy array helper method
//        String [] newArr = Arrays.copyOf(daysOfWeek, 10);
//        System.out.println(Arrays.toString(newArr));
//
//        //define while copying
////        daysOfWeek = Arrays.copyOf(daysOfWeek, 15);
////        System.out.println(Arrays.toString(daysOfWeek));
//
//
//        //lexico numeric sorting
//        //lowers after uppers
////        character position by character position
//        Arrays.sort(daysOfWeek);
//        System.out.println(Arrays.toString(daysOfWeek));
//
//        Fighter [] arena = new Fighter[5];
//        System.out.println(Arrays.toString(arena));
//
//        arena[0] = new Fighter("Knull");
//        System.out.println(Arrays.toString(arena));
//        System.out.println(arena[0]);

        //ex1 copy of method

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers);

//        Person[] people = new Person[3];
//        Person matthew = new Person("Matthew");
//        Person rosie = new Person("Rosie");
//        Person nikki = new Person("Nikki");
        int n = 3;
        String[] Person = {"Matthew", "Rosie", "Nikki"};
        String personName = "Kenzi";
//        String personName = "Jeremy";
        Person = addPerson(personName, n, Person);

//        System.out.println(Arrays.toString(Person));
        String[] newArr = addPerson(personName, n, Person);
        System.out.println(Arrays.toString(newArr));






        //ex2







    }
}
