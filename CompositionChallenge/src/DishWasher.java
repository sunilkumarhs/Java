public class DishWasher {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void doDishes() {
        if(hasWorkToDo) {
            System.out.println("Wash the dishes");
            hasWorkToDo=false;
        }else {
            System.out.println("Load the dishes!!");
        }
    }
}
