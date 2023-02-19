package grocerylist;

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

    public static void main(String[] args) {
        Input input = new Input();

        items = new HashMap<>();

//        Item apples = new Item("apples");
//        apples.addQuantity(4);
//        System.out.println(apples.TotalQuantity);
//        apples.addQuantity(4);
//        System.out.println(apples.getTotalQuantity());
//        System.out.println(apples);
//
//        apples.addCategory("produce");
//        System.out.println(apples);
//
//        items.put("apples", apples);

         do {
            printMenu();
            boolean choice = Input.yesNo();
            if(!choice) {
                break;
            }
        } while(true);

        System.out.println("Bye");

    }

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

    private static void printMenu() {
        System.out.print("""
                Would you like to make a grocery list?

                0: Exit
                1: Print student info
                2: View all the grades
                3: Overall class average
                4: Print CSV report

                Enter your choice:
                """);
    }
}
