package lectures;

import playtime.Fighter;
import playtime.Weapon;

import java.util.*;

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

//        HashMap<String, Fighter> roster = new HashMap<>();
//        roster.put("Knull", knull);
//        System.out.println(roster);
//        roster.putIfAbsent("Knull", null);
//        System.out.println(roster);
//        //return bool
//        System.out.println(roster.containsKey("Knull"));
//
//        //output is based on local fighter definition
//        System.out.println(roster.containsValue(knull));
//
//        Fighter checkFighter = new Fighter("Knull");
//        System.out.println(roster.containsValue(checkFighter));
//
//        roster.put("bob", new Fighter("Bob"));
//        roster.put("sue", new Fighter("Sue"));
//        roster.put("ragnar", new Fighter("Ragnar"));
//        Set<String> keys = roster.keySet();
//
//        for (String key : keys) {
//            Fighter aFighter = roster.get(key);
//            System.out.println(aFighter);
//        }


        // ************* HASHMAP

        // explain hashmap
        // terms: key value
        // use diagram of file cabinet

        // show hashmap
        // use favoriteMovies
        HashMap<String, Fighter> roster = new HashMap<>();
        roster.put("Knull", knull);
        System.out.println(roster);

        // show .put()
        // does it overwrite or duplicate if we put again?
//        roster.put("Knull", null);
        roster.putIfAbsent("Knull", null);
        System.out.println(roster);

        // print hashmap

        // show .get()
        Fighter f1 = roster.get("Knull");
        System.out.println(f1); // is Knull
        f1 = roster.get("KnullXXX");
        System.out.println(f1); // is null

        // show .getOrDefault()
        f1 = roster.getOrDefault("KnullXXX", new Fighter("Bob"));
        System.out.println(f1); // is null

        // show .containsKey
        System.out.println(roster.containsKey("Knull"));
        System.out.println(roster.containsKey("KnullXXX"));

        // show .containsValue
        // may need to define .equals() for this
        // or save a movie to a variable
        System.out.println(roster.containsValue(knull));
        Fighter checkFighter = new Fighter("Knull");
        System.out.println(roster.containsValue(checkFighter));

        // show .putIfAbsent

        // show .replace with 2 and 3 args
        // print hashmap
        System.out.println(roster);
        roster.replace("Knull", null);
        System.out.println(roster);

        // show .remove()
        // print hashmap
        System.out.println(roster.isEmpty());
        roster.remove("Knull");
        System.out.println(roster.isEmpty());

        // show .isEmpty()

        // show .clear()
        // print hashmap
        roster.put("Knull2", f1);
        System.out.println(roster);
        roster.clear();
        System.out.println(roster);

        // show how to iterate over a hashmap
        // use .keySet()
        // and foreach over the set with a .get()
        roster.put("bob", new Fighter("Bob"));
//        roster.put("sue", new Ninja("Sue"));
        roster.put("ragnar", new Fighter("Ragnar"));

        Set<String> keys = roster.keySet();
        for (String key : keys) {
            Fighter aFighter = roster.get(key);
            System.out.println(aFighter);
        }


    }


}



//
//package lectures;
//
//        import playtime.Fighter;
//        import playtime.Ninja;
//        import playtime.Weapon;
//
//        import java.util.*;
//
//public class CollectionsLec {
//    public static void main(String[] args) {
//
//        // explain Collections
//        // Lists, Sets, Maps
//
//        // ************* ARRAYLIST
//
//        // explain ArrayList
//        ArrayList<String> foods = new ArrayList<>();
//
//        // declare an ArrayList
//        // explain <String>
//        // add a few elements
//        // try to add something not String
//        foods.add("pizza");
//        foods.add("shepherd's pie");
//        System.out.println(foods);
//
//        String [] otherFoods = {"kibble", "bits"};
//        foods.addAll(Arrays.asList("bob", "sue"));
//
//        // output an arraylist
//        System.out.println(foods);
//
//        // use ArrayList initializer
//        // explain Arrays.asList function
//        foods = new ArrayList<>(Arrays.asList("apple", "banana"));
//        foods.add("pear");
//        System.out.println(foods);
//
//        // show size() instead of .length
//        // add another element
//        // print size()
//        System.out.println(foods.size());
//        foods.add("cake");
//        System.out.println(foods.size());
//
//        // get an element at a given index
//        System.out.println(foods.get(foods.size() - 1));
//
//        // show loops with ArrayList
//        for (int i = 0; i < foods.size(); i++) {
//            System.out.println(foods.get(i));
//        }
//        for (String food : foods) {
//            System.out.println(food);
//        }
//
//        // show .indexOf()
//        // is indexOf() overloaded ?
//        // show .lastIndexOf()
//        // is there a .contains() ?
//        System.out.println(foods.indexOf("cake"));
//        System.out.println(foods.indexOf("apple"));
//        System.out.println(foods.indexOf("nutrigrain bar"));
//        foods.add("cake");
//        System.out.println(foods);
//        System.out.println(foods.lastIndexOf("cake"));
//
//        System.out.println(foods.contains("cake"));
//        System.out.println(foods.contains("Cake"));
//        System.out.println(foods.contains("nutrigrain bar"));
//
//        // show .remove()
////        foods.remove("cake");
////        foods.removeAll(Arrays.asList("apple", "cake"));
//
//        // show .removeAll (will need Arrays.asList() )
//        foods.removeAll(List.of("apple", "cake"));
//        System.out.println(foods);
//
//        // show isEmpty()
//        System.out.println(foods.isEmpty());
//
//        // SHOW AN EXAMPLE OF A CLASS WITH AN ARRAYLIST INSIDE IT
//        // maybe Fighter with a list of weapons
//        // have an addWeapon method
//        Fighter knull = new Fighter("Knull");
//        knull.addWeapon(new Weapon("Axe", 10));
//        knull.addWeapon(new Weapon("Broom", 2));
//        System.out.println(knull);
//
//
//    }
//}
