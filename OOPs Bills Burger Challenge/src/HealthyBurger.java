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
    public double additionalItems(String addition) {
        double additionPrice = super.additionalItems(addition);
        peaNut = addition.contains("5");
        cheese = addition.contains("6");
        if(peaNut) {
            additionPrice += 85;
        }
        if(cheese) {
            additionPrice += 90;
        }
        return additionPrice;
    }
}
