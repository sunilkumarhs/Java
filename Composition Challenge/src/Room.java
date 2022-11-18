public class Room {
    private String name;
    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    private Ceilling theCeil;
    private Bed theBed;
    private Lamp lamp;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceilling theCeil, Bed theBed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.theCeil = theCeil;
        this.theBed = theBed;
        this.lamp = lamp;
    }

    public void arrange() {
        System.out.println("BedSheet has been applied to bed");
        theBed.ready(true);
    }

    public void openDoor() {
        System.out.println("This is "+name+" BedRoom");
    }

    public void turnLampOn(boolean button) {
        lamp.turnOn(button);
    }

    private String getName() {
        return name;
    }

    private Wall getWall1() {
        return wall1;
    }

    private Wall getWall2() {
        return wall2;
    }

    private Wall getWall3() {
        return wall3;
    }

    private Wall getWall4() {
        return wall4;
    }

    private Ceilling getTheCeil() {
        return theCeil;
    }

    private Bed getTheBed() {
        return theBed;
    }

    private Lamp getLamp() {
        return lamp;
    }
}
