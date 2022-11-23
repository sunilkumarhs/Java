public class HealthyBurger extends Hamburger{
    private boolean peaNut;
    private boolean cheese;
    public HealthyBurger() {
        super("Brown Rye Bread Roll",250,"Healthy Burger");
    }

    @Override
    public void viewBurger() {
        super.viewBurger();
        System.out.println("5.PeaNut     - +85Rs   \n"+
                           "6.Cheese     - +90Rs");
    }

    @Override
    public double buyBurger(int qty) {
        return super.buyBurger(qty);
    }

    @Override
    public double additionalItems(String addition) {
        super.setLettuce(addition.contains("1"));
        super.setTomato(addition.contains("2"));
        super.setCarrot(addition.contains("3"));
        super.setCaliFlower(addition.contains("4"));
        peaNut = addition.contains("5");
        cheese = addition.contains("6");
        double additionPrice = 0;
        if(super.isLettuce()) {
            additionPrice += 50;
        }
        if(super.isTomato()) {
            additionPrice += 60;
        }
        if(super.isCarrot()) {
            additionPrice += 55;
        }
        if(super.isCaliFlower()) {
            additionPrice += 65;
        }
        if(peaNut) {
            additionPrice += 85;
        }
        if(cheese) {
            additionPrice += 90;
        }
        return additionPrice;
    }
}
