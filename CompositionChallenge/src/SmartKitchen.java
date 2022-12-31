public class SmartKitchen {
    private DishWasher dishWasher;
    private Refrigerator fridge;
    private CoffeeMaker oven;
    public SmartKitchen() {
        dishWasher = new DishWasher();
        fridge = new Refrigerator();
        oven = new CoffeeMaker();
    }
    public void addWater() {
        fridge.setHasWorkToDo(true);
    }
    public void pourMilk() {
        oven.setHasWorkToDo(true);
    }
    public void loadDishwasher() {
        dishWasher.setHasWorkToDo(true);
    }
    public void doKitchenWork(int ch) {
       switch (ch) {
          case 1 -> oven.brewCoffee();
          case 2 -> fridge.orderFood();
          case 3 -> dishWasher.doDishes();
           default -> System.out.println("Invalid value");
       }
    }

    public void setKitchenState(boolean coffee, boolean fridges, boolean dish) {
        oven.setHasWorkToDo(coffee);
        fridge.setHasWorkToDo(fridges);
        dishWasher.setHasWorkToDo(dish);
    }

    public void doKitchenWork() {
        oven.brewCoffee();
        fridge.orderFood();
        dishWasher.doDishes();
    }
}
