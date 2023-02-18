public class DeluxeBurger extends  Hamburger{
    private boolean chips;
    private boolean drinks;

    public DeluxeBurger() {
        super("Bread Meat Role", 200, "Deluxe Burger");
        this.chips = true;
        this.drinks = true;
    }

    @Override
    public void viewBurger() {
        System.out.println("The "+ this.getName() +" contains "+ this.getRollType() +" in it");
        System.out.println("The  base price of "+ this.getName() +" :- "+ this.getBasePrice() +"Rs");
        System.out.println("There will be no additional components added to this burger!!");
        System.out.println("Instead you will get chips and drinks as side component of this burger");
    }

    @Override
    public double buyBurger(int qty) {
        double totalAmount = 0;
        for(int i=1;i<=qty;i++) {
            double totalPrice = 0;
            totalPrice = additionalItems() + this.getBasePrice();
            totalAmount += totalPrice;
            System.out.println("Your total price of "+i+"th "+ this.getName() +" :- "+totalPrice+"Rs");
            System.out.println("-------------------------------------------------------------");
        }
        System.out.println("Your total amount of "+qty+" "+ this.getName() +" :- "+totalAmount+"Rs");
        System.out.println("--------------------------------------------------------------------------------------------");
        return totalAmount;
    }
    public double additionalItems() {
        double additionPrice = 0;
        if(this.chips) {
            additionPrice += 50;
        }
        if(this.drinks) {
            additionPrice += 50;
        }
        return additionPrice;
    }
}
