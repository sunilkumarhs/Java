public class Main {
    public static void main(String[] args) {
        Wall wall1 = new Wall("North");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("West");
        Wall wall4 = new Wall("South");
        Ceilling ceilling = new Ceilling(240.56F,180.34F,"Blue");
        Bed bed = new Bed(58.67F,23.45F,2,1,"Peps");
        Lamp lamp = new Lamp("Philips",true,"LED Bar");
        Room room = new Room("Ajay",wall1,wall2,wall3,wall4,ceilling,bed,lamp);

        room.openDoor();
        room.turnLampOn(true);
        room.arrange();
        room.turnLampOn(false);
    }
}
