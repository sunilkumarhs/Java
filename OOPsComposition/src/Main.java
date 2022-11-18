public class Main {
    public static void main(String[] args) {
       Dimensions dimensions = new Dimensions(250.45F,140.45F,30.5F);
       Case theCase = new Case("320V","Lenovo","240v",dimensions);
       Monitor theMonitor = new Monitor("18inch Performer","Dell",14,new Resolution(170.18F,180.17F));
       MotherBoard theMotherBoard = new MotherBoard("VK-1718","Asus",4,7,"v1.20");
       PC thePC = new PC(theCase,theMonitor,theMotherBoard);
       thePC.getTheCase().pressPowerButton();
       thePC.getMotherBoard().loadProgram("Windows");
       thePC.getMonitor().drawPixelArt(170,180,"red");
    }
}
