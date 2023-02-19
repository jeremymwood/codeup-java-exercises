package grocerylist;

import grades.Student;
import util.Input;

import java.awt.event.ItemEvent;
import java.util.Arrays;
import java.util.HashMap;

public class Groceries {
//    grocery list command line application
//
//    use  input class
    private static Input input = new Input();

    private static HashMap<String, Item> items;
//
//    prompt to create a grocery list
//      no: close application
//
//      yes: prompt for new item
//          yes: three prompts:
//              1) select category
//                  produce
//                  dairy
//                  dry goods
//                  frozen
//              2) Enter item name
//              3) Enter item quantity
//          finalize or add another item?
//
//    print list a-z by category with quantity

    public static void main(String[] args) {
        Input input = new Input();

        items = new HashMap<>();

        Item apples = new Item("apples");
        apples.addQuantity(4);
        System.out.println(apples.TotalQuantity);
        apples.addQuantity(4);
        System.out.println(apples.getTotalQuantity());
        System.out.println(apples);

        apples.addCategory("produce");
        System.out.println(apples);



    }
}
