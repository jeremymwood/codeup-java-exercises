import playtime.Fighter;
import playtime.Weapon;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysExercises {

    private String name;
//    public Person(String name) {
//        this.name = name;
//    }
//    @Override
//    public String toString() {
//        return "ArraysExercises{" +
//                "name='" + name + '\'' +
//                '}';
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
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

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(numbers);


//        String[] people = {"Matthew", "Rosie", "Nikki", "Jeremy"};
//        int n = people.length;
//        String personName = "Kenzi";
////        String personName = "Jeremy";
////        Person kenzi = new Person("Kenzi");
//        String[] newArr = addPerson(personName, n, people);
//        System.out.println(Arrays.toString(newArr));


//        Person [] people = new Person[3];
//        System.out.println(Arrays.toString(people));
//        people[0] = new Person("Matthew");
//        people[1] = new Person("Rosie");
//        people[2] = new Person("Nikki");
//        System.out.println(Arrays.toString(people));
//
//        for (Person person : people) {
//            System.out.println(person);
//        }
//
//        people = addPerson(people, new Person("Lou"));
//        System.out.println(Arrays.toString(people));
//

        //probably have something wrong in Person class
//        public static Person[] addPerson(Person [] people, Person newPerson) {
//            Person [] newArray = Arrays.copyOf(people, people.length + 1);
//            newArray[newArray.length - 1] = newPerson;
//            return newArray;
//        }

//        doc's code
//        public static Person [] addPerson(Person [] people, Person newPerson) {
//            // create a copy of people that has 1 new extra slot in it
//            Person [] newArray = Arrays.copyOf(people, people.length + 1);
//            newArray[newArray.length - 1] = newPerson;
//            return newArray;
//        }

    }
}
