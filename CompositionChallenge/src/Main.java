public class Main {
    public static void main(String[] args) {
        SmartKitchen sk = new SmartKitchen();
       sk.addWater();
       sk.pourMilk();
       sk.loadDishwasher();
       sk.doKitchenWork(1);
       sk.doKitchenWork(2);
       sk.doKitchenWork(3);
       sk.doKitchenWork(4);
       sk.doKitchenWork(1);
       sk.pourMilk();
       sk.doKitchenWork(1);
        System.out.println("-".repeat(50));
        System.out.println("One time call to Kitchen appliances");
        sk.setKitchenState(true, false, true);
        sk.doKitchenWork();
    }
}
