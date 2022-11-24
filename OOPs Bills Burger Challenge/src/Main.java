import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Bill's Burger Shop");
        Hamburger burger1 = new Hamburger();
        Hamburger burger2 = new HealthyBurger();
        Hamburger burger3 = new DeluxeBurger();
        double totalAmount = 0;
        while(true) {
            System.out.println("Burgers List :");
            System.out.println(" 1.Hamburger \n 2.HealthyBurger \n 3.DeluxeBurger \n 4.TotalAmount");
            System.out.println("Please select the burgers!!");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    burger1.viewBurger();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Enter the quantity of burgers :");
                    int qty = scan.nextInt();
                    totalAmount += burger1.buyBurger(qty);
                    break;
                case 2:
                    burger2.viewBurger();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Enter the quantity of burgers :");
                    qty = scan.nextInt();
                    totalAmount += burger2.buyBurger(qty);
                    break;
                case 3:
                    burger3.viewBurger();
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Enter the quantity of burgers :");
                    qty = scan.nextInt();
                    totalAmount += burger3.buyBurger(qty);
                    break;
                case 4:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Total amount of the all burgers :- "+totalAmount+"Rs");
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("Thank You for visiting Bill's Burgers Shop");
                    System.out.println("We are happy to welcome you again - please visit again!!");
                    System.exit(0);

            }
        }
    }
}
