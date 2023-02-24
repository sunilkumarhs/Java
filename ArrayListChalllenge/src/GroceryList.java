import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class GroceryList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        while(true) {
            if(list.isEmpty()) {
                System.out.println("No Items in the List!!");
            }else {
                System.out.println("Items in the List are:");
                list.sort(Comparator.naturalOrder());
                System.out.println(list);
            }
            System.out.println("Welcome to the Grocery List Block:");
            System.out.println("Choose the action that you need to perform:");
            System.out.println("0 - Quit the GroceryList");
            System.out.println("1 - Add the item to the GroceryList");
            System.out.println("2 - Remove the item from the GroceryList");
            System.out.println("Enter your option:");
            int opt = scan.nextInt();
            if(opt == 0) {
                System.exit(0);
            } else if (opt == 1) {
                list = addItem(list);
            } else if (opt == 2) {
                list = removeItem(list);
            }else {
                System.out.println("Irrelevant option entry");
                System.out.println("Enter your option:");
            }
        }
    }
    private static ArrayList<String> addItem(ArrayList<String> addList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item to add into the list:");
        String item = scan.nextLine();
        if(addList.contains(item)) {
            System.out.println("This item already exists in the list");
        }else {
            addList.add(item);
        }
        return addList;
    }

    private static ArrayList<String> removeItem(ArrayList<String> removeList) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the item to remove from the list:");
        String item = scan.nextLine();
        if(removeList.contains(item)) {
            removeList.remove(item);
        }else {
            System.out.println("The item does not present in the list!!");
        }
        return removeList;
    }
}
