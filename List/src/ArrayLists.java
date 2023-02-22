import java.util.ArrayList;
import java.util.Arrays;

record GroceryItems(String name, String type, int count) {
    public GroceryItems(String name) {
        this(name, "Dairy",1);
    }
    @Override
    public String toString() {
        return String.format("%d %s in %s",count, name.toUpperCase(),type);
    }
}
public class ArrayLists {
    public static void main(String[] args) {
        GroceryItems[] groceryArray = new GroceryItems[3];
        groceryArray[0] = new GroceryItems("Milk");
        groceryArray[1] = new GroceryItems("Carrot", "Vegetable",3);
        groceryArray[2] = new GroceryItems("Mango", "Fruits", 5);

        System.out.println(Arrays.deepToString(groceryArray));

        ArrayList groceryList = new ArrayList();
        groceryList.add(new GroceryItems("Gee"));
        groceryList.add("Honey");
        System.out.println(groceryList);

        ArrayList <GroceryItems> groceryItemsList = new ArrayList<>();
        groceryItemsList.add(new GroceryItems("Butter"));
        groceryItemsList.add(new GroceryItems("Potato", "Vegetable",8));
//        groceryItemsList.add("LionHoney"); Type error
        System.out.println(groceryItemsList);
        groceryItemsList.add(0,
                new GroceryItems("Apple", "Fruits", 6));
        System.out.println(groceryItemsList);
        groceryItemsList.set(1,
                new GroceryItems("Gee"));
        System.out.println(groceryItemsList);
        groceryItemsList.remove(1);
        System.out.println(groceryItemsList);
    }
}
