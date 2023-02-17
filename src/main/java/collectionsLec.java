import playtime.Fighter;
import playtime.Weapon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class collectionsLec {
    public static void main(String[] args) {

        //collections: way to group stuff in lists, sets and maps

        ArrayList<String> foods = new ArrayList<>();
        foods.add("sushi");
        foods.add("tacos");
        foods.add("kebab");
        System.out.println(foods);



        String [] otherFoods = {"kibble", "bits"};
        foods.addAll(Arrays.asList("stew", "pie"));
        System.out.println(foods);
        foods.addAll(Arrays.asList(otherFoods));
        System.out.println(foods);

        foods.add("soup");
        System.out.println(foods);

        //loops
/*        for (int i = 0; i < foods.size(); i++) {
            System.out.println(foods.get(i));
        }*/

        //redefine
        foods = new ArrayList<>(Arrays.asList("apple", "banana"));
        System.out.println(foods);

        foods.add("cake");
        System.out.println(foods);
        //array length
        System.out.println(foods.size());

        for (String food : foods) {
            System.out.println(food);
        }

        //index
        System.out.println(foods.indexOf("cake"));
        foods.add("cake");
        System.out.println(foods);
        System.out.println(foods.lastIndexOf("cake"));

//        foods.remove("banana");
        System.out.println(foods);

        //arrays
        foods.removeAll(List.of("apple", "banana"));
//        foods.removeAll(foods);
        System.out.println(foods);

        //
        System.out.println(foods.isEmpty());

        Fighter knull = new Fighter("knull");
        knull.addWeapon(new Weapon("Axe", 5));
        knull.addWeapon(new Weapon("Broom", 1));
        System.out.println(knull);


//        ***HASHMAPS***

        HashMap<String, Fighter> roster = new HashMap<>();
        roster.put("Knull", knull);
        System.out.println(roster);
        roster.putIfAbsent("Knull", null);
        System.out.println(roster);
        //return bool
        System.out.println(roster.containsKey("Knull"));

        //output is based on local fighter definition
        System.out.println(roster.containsValue(knull));

        Fighter checkFighter = new Fighter("Knull");
        System.out.println(roster.containsValue(checkFighter));

    }


}
