import java.util.ArrayList;

public class collectionsLec {

    public static void main(String[] args) {

        //collections: way to group stuff in lists, sets and maps

        ArrayList<String> foods = new ArrayList<>();
        foods.add("sushi");
        foods.add("tacos");
        foods.add("kebabs");
        System.out.println(foods);

        for (int i = 0; i < foods.toArray().length; i++) {
            System.out.println(foods.get(i));
        }


    }

}
