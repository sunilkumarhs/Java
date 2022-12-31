public class Refrigerator {
    private boolean hasWorkToDo;
    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo=hasWorkToDo;
    }
    public void orderFood() {
        if(hasWorkToDo) {
            System.out.println("Food order is done");
            hasWorkToDo=false;
        }else {
            System.out.println("Add Water!!");
        }
    }
}
