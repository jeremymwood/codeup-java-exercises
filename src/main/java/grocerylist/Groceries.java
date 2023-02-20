package grocerylist;

import grades.Student;
import util.Input;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Groceries {
    private static Input input = new Input();
    private static Scanner scanner = new Scanner(System.in);

    private static HashMap<String, Item> items;
    public static void main(String[] args) {
//        Input input = new Input();
        items = new HashMap<>();
//        Item apples = new Item("apples");
//        apples.addQuantity(4);
//        System.out.println(apples.TotalQuantity);
//        apples.addQuantity(4);
//        System.out.println(apples);
//        apples.addCategory("produce");
//        System.out.println(apples);
//        items.put("apples", apples);
         System.out.print("Would you like to make a grocery list? (Y/N)");
         do {
            boolean choice = Input.yesNo();
            if(choice) {
                categoryMenu();
            }
             break;
        } while(true);
        System.out.println("Bye");

    }
//              2) Enter item name
//              3) Enter item quantity
//          finalize or add another item?
//    print list a-z by category with quantity
        private static void categoryMenu() {
            System.out.print("""
                    Select a category to add an item to:

                    1: Produce
                    2: Dairy
                    3: Dry goods
                    4: Frozen
                    5: Exit
                    """);

            do {
                int choice = input.getInt(1, 5, "");
                doChoice(choice);
                if(choice == 5) {
                    break;
                }
            } while(true);

        }

    private static void doChoice(int choice) {
        switch (choice) {
            case 1:
                addProduce();
                break;
            case 2:
                addDairy();
                break;
            case 3:
                addDryGoods();
                break;
            case 4:
                addFrozen();
                break;
            case 5:
                break;
        }
    }

    private static void addProduce() {
//        Set<String> keys = items.keySet();
//        Item apples = new Item("apples");
//        apples.addQuantity(4);
//        System.out.println(apples.TotalQuantity);
//        apples.addQuantity(4);
//        System.out.println(apples);
//        apples.addCategory("produce");
//        System.out.println(apples);
//        items.put("apples", apples);
        System.out.print("Enter fruit or vegetable:");
        String string = scanner.nextLine();

//        input = new Input();
//        String nextInput = input.nextLine();
        System.out.println(string);


//        for (String key : keys) {
//            Item anItem = items.get(key);
////            Item apples = new Item("apples");
//            anItem.getName();
//            System.out.print(anItem);
//            System.out.print(anItem.name);
//        }
    }
    private static void addDairy() {
            System.out.print("Enter a dairy item:");
    }
    private static void addDryGoods() {
            System.out.print("Enter a dry good:");
    }
    private static void addFrozen() {
            System.out.print("Enter a frozen item:");
    }

}
