public class CoffeeMaker {
    private  boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void brewCoffee() {
        if(hasWorkToDo) {
            System.out.println("Make the coffee");
            hasWorkToDo=false;
        }else {
            System.out.println("Pour the Milk!!");
        }
    }
}
