public class ArtObjects extends ProductForSale{

    public ArtObjects(String type, double price, String description) {
        super(type, price, description);
    }

    @Override
    public void Details() {
        System.out.println("This "+type+" is very good product!");
        System.out.printf("The price of the product is ₹%6.2f %n",price);
        System.out.println(description);
    }
}
