import java.util.ArrayList;
import java.util.Scanner;

record OrderProducts(int orderNumber,int quantity,ProductForSale products) {
}
public class Store {

    private static ArrayList<ProductForSale> storeProducts = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int orderNo=1;
        System.out.println("Welcome to the Store");
        while(true) {
            System.out.println("1.AddProducts \n 2.ListProducts \n 3.OrderItems \n 4.Close Application");
            System.out.println("Select your choice: ");
            int choice = scan.nextInt();
            switch(choice) {
                case 1:
                    System.out.println("1.ArtObjects \n 2.Furniture");
                    System.out.println("Choose your Product chamber: ");
                    int chamber = scan.nextInt();
                    if(chamber == 1) {
                        scan.nextLine();
                        System.out.println("Enter type of the product of ArtObjects chamber: ");
                        String type = scan.nextLine();
                        System.out.println("Enter the price of the product: ");
                        double price = scan.nextDouble();
                        scan.nextLine();
                        System.out.println("Enter the description of the product: ");
                        String description = scan.nextLine();
                        storeProducts.add(new ArtObjects(type,price,description));
                    }else if(chamber == 2) {
                        scan.nextLine();
                        System.out.println("Enter type of the product of Furniture chamber: ");
                        String type = scan.nextLine();
                        System.out.println("Enter the price of the product: ");
                        double price = scan.nextDouble();
                        scan.nextLine();
                        System.out.println("Enter the description of the product: ");
                        String description = scan.nextLine();
                        storeProducts.add(new Furnitures(type,price,description));
                    }else {
                        System.out.println("Enter the proper choice!!");
                    }
                    break;
                case 2:
                    listProducts();
                    break;
                case 3:
                    //var order="sand";
                    var order = new ArrayList<OrderProducts>();
                    System.out.println("Order your products: ");
                    int i=0;
                    boolean ordering = true;
                    while(ordering==true) {
                        for(var product : storeProducts) {
                            System.out.println("Product Index - "+i+" : "+product.type);
                            i=i+1;
                        }
                        System.out.println("Enter 0 to order the products or 1 to exit the order block: ");
                        int orderChoice = scan.nextInt();
                        if(orderChoice==0) {
                            System.out.println("Enter the product index that you wanted to order: ");
                            int index = scan.nextInt();
                            while(index > i) {
                                System.out.println("Enter the proper product index!!");
                                System.out.println("Enter the product index that you wanted to order: ");
                                index = scan.nextInt();
                            }
                            System.out.println("Enter the quantity of product to order: ");
                            int quantity = scan.nextInt();
                            addProductOrdered(order,orderNo,index,quantity);
                        } else if (orderChoice==1) {
                            printOrder(order);
                            orderNo+=1;
                            ordering = false;
                        }else {
                            System.out.println("Enter proper order id!!");
                        }
                        i=0;
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Enter proper choice!!");
            }
        }

//        storeProducts.add(new ArtObjects("Oil Paint",1750,"Asian Oil paint is released in 2010"));
//        storeProducts.add(new ArtObjects("Water Proof Paint",2450,"Asian waterproof paint is released in 2015"));
//        storeProducts.add(new Furnitures("Chair",2000,"Very good wood is used"));
//        storeProducts.add(new Furnitures("Table",4500,"Table as ver good quality of good"));
//        listProducts();
//        System.out.println("Order1: ");
//        var order1 = new ArrayList<OrderProducts>();
//        addProductOrdered(order1,1,2);
//        addProductOrdered(order1,0,1);
//        printOrder(order1);
//        System.out.println("Order2: ");
//        var order2 = new ArrayList<OrderProducts>();
//        addProductOrdered(order2,3,4);
//        addProductOrdered(order2,2,5);
//        printOrder(order2);
    }
    public static void listProducts() {
        for(var product : storeProducts) {
            System.out.println("-".repeat(30));
            product.Details();
        }
        System.out.println("-".repeat(30));
    }
    public static void addProductOrdered(ArrayList<OrderProducts> order,int orderNo, int OrderIndex, int quantity) {
        order.add(new OrderProducts(orderNo,quantity,storeProducts.get(OrderIndex)));
    }
    public static void printOrder(ArrayList<OrderProducts> order) {
        double salesTotal = 0;
        int i=0;
        System.out.println("-".repeat(30));
        System.out.println("Your Order details: ");
        for(var item : order) {
            if(i==0) {
                System.out.println("Order Number-"+item.orderNumber());
            }
            item.products().pricedLineItem(item.quantity());
            System.out.print("Total = "+item.products().salesPrice(item.quantity())+"\n");
            salesTotal+=item.products().salesPrice(item.quantity());
            i+=1;
        }
        System.out.printf("Sales Total = ₹%6.2f %n", salesTotal);
        System.out.println("-".repeat(30));
    }
}
