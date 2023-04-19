public abstract class ProductForSale {
    protected String type;
    protected double price;
    protected String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public double salesPrice(int quantity) {
        return (quantity*price);
    }
    public void pricedLineItem(int quantity) {
        System.out.printf("%2d qty of %-15s at ₹%8.2f each,  %-35s ",quantity,type,price,description);
    }
    public abstract void Details();
}
