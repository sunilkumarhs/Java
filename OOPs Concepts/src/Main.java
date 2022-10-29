public class Main {
    public static void main(String[] args) {
        Car mahendra = new Car();
        Car tata = new Car();
        mahendra.setColour("blue");
        mahendra.setDoors(5);
        mahendra.setEngine("MHawk2000");
        mahendra.setModel("XUV700");
        mahendra.setSeats(7);
        System.out.println("The details of the Mahendra car is :");
        System.out.println("The model of the car is : "+mahendra.getModel() );
        System.out.println("Colour :"+mahendra.getColour());
        System.out.println("Number of doors is : "+mahendra.getDoors());
        System.out.println("Engine : "+mahendra.getEngine());
        System.out.println("Number of seats in car is : "+mahendra.getSeats());
        System.out.println("----------------------------------------------------------------------------");
        System.out.println(" ");
        tata.setSeats(4);
        tata.setModel("Nexon");
        tata.setEngine("TataDualBoost");
        tata.setDoors(1);
        tata.setColour("Black");
        System.out.println("The details of the TATA car is : ");
        System.out.println("The model of the car is : "+tata.getModel() );
        System.out.println("Colour :"+tata.getColour());
        System.out.println("Number of doors is : "+tata.getDoors());
        System.out.println("Engine : "+tata.getEngine());
        System.out.println("Number of seats in car is : "+tata.getSeats());
    }

}
