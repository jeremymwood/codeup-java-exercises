package grocerylist;

import java.util.ArrayList;

public class Item {

//    ***properties***
    public String name;

    @Override
    public String toString() {
        return "Item{" +
                "name= " + name +
                ", category= " + AllCategories + ", total quantity= " + TotalQuantity +
                "}";
    }

    public ArrayList<Integer> TotalQuantity;
    public ArrayList<String> AllCategories;


    public Item(String name) {
        this.name = name;
        this.TotalQuantity = new ArrayList<>();
        this.AllCategories = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuantity(int quantity) {
        TotalQuantity.add(quantity);
    }

    public void addCategory(String category) {
        AllCategories.add(category);
    }

    public double getTotalQuantity() {
        int quantitySum = 0;
        for (int quantity : TotalQuantity) {
            quantitySum += quantity;
        }
        return quantitySum;
    }


}
