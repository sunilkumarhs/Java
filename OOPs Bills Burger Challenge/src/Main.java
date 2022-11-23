public class Main {
    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger();
//        hamburger.viewBurger();
//        hamburger.buyBurger(3);
        Hamburger hamburger1 = new HealthyBurger();
        hamburger1.viewBurger();
        hamburger1.buyBurger(2);
    }
}
