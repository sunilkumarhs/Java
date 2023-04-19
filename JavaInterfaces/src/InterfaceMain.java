public class InterfaceMain {
    public static void main(String[] args) {
        System.out.println("Bird Class Details");
        Bird bird = new Bird();
        bird.move();
        inFlight(bird);
        System.out.println("-".repeat(30));
        System.out.println("Jet Class Details");
        Jet jet = new Jet();
        double kmsTravelled = 100;
        double milesTravelled = kmsTravelled*FlightEnabled.KM_TO_MILES;
        inFlight(jet);
        System.out.printf("The Jet travelled %8.2fkm or %8.4fmiles %n",kmsTravelled,milesTravelled);
        System.out.println("-".repeat(30));
        System.out.println("Truck Class Details");
        Truck truck = new Truck();
        truck.track();
        System.out.println("-".repeat(30));
        System.out.println("Rocket Class Details");
        Rocket rocket = new Rocket();
        rocket.takeOff();
        rocket.track();
        rocket.fly();
        rocket.land();
        rocket.launchOrbit();
    }
    private static void inFlight(FlightEnabled flight) {
        flight.takeOff();
        flight.fly();
        if(flight instanceof Tracking tracks){
            tracks.track();
        }
        flight.land();
    }
}
