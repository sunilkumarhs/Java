import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("The Products with their prices :");
        for(ProductPricing price : ProductPricing.values()) {
            System.out.printf("%s : ₹%10.2f %n",price.name(),price.getPrice());
        }
        System.out.println("Enter the product name to find its price :");
        String name = scan.next();
        for(ProductPricing pPrice : ProductPricing.values()) {
            if(pPrice.name().equals(name)) {
                System.out.printf("%s : ₹%10.2f %n",pPrice.name(),pPrice.getPrice());
            }else {
                System.out.printf("%s is not found!!",name);
            }
        }
    }
}
