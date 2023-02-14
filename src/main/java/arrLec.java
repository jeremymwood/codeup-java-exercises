import util.Input;

import java.nio.file.LinkPermission;
import java.util.Arrays;

public class arrLec {

    public static void main(String[] args) {
        int [] ages;

        //must be same data type specified
        ages = new int[4];

        //memory address
        System.out.println(ages);

        //static sout helper method
        //int fills zeros by default
        System.out.println(Arrays.toString(ages));

        //define index
        ages[0] = 42;
        System.out.println(Arrays.toString(ages));

        //define index
        ages[3] = 36;
        System.out.println(Arrays.toString(ages));

        //out of bounds wont run
//        ages[4] = 36;
//        System.out.println(Arrays.toString(ages));

        //redefine and now works, previous values lost
        //arrays are inflexible and better used for things that never change, ie days of the week
        ages = new int[12];
        ages[4] = 57;
        System.out.println(Arrays.toString(ages));

        Input input = new Input();
        System.out.println("how many elements?");
        int arrayLength = input.getInt();
        ages = new int[arrayLength];

        ages[11] = 24;
        System.out.println(Arrays.toString(ages));

    }
}
