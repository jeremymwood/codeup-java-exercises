package quiz;

import java.util.ArrayList;
import java.util.List;

public class JavaOneQuiz {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(new Integer(3));
        numbers.add(3.3);
        System.out.println(numbers);
    }

}
