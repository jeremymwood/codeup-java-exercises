package grocerylist;

import java.util.ArrayList;

public class Item {

//    ***properties***
    public String name;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                "name='" + TotalQuantity + '\'' +
                '}';
    }

    public ArrayList<Integer> TotalQuantity;


    public Item(String name) {
        this.name = name;
        this.TotalQuantity = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuantity(int quantity) {
        TotalQuantity.add(quantity);
    }

    public double getTotalQuantity() {
        int quantitySum = 0;
        for (int quantity : TotalQuantity) {
            quantitySum += quantity;
        }
        return quantitySum / TotalQuantity.size();
    }


}
