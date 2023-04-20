import java.util.LinkedList;
import java.util.List;

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
        LinkedList<FlightEnabled> flight = new LinkedList<>();
        flight.add(jet);
        List<FlightEnabled> betterFlight = new LinkedList<>();
        betterFlight.add(jet);
        System.out.println("Linked List Flight Enabled:");
        triggerFlight(flight);
        flyFlight(flight);
        landFlight(flight);
        System.out.println("Better Linked List Flight Enabled:");
        triggerFlight(betterFlight);
        flyFlight(betterFlight);
        landFlight(betterFlight);

    }
    private static void inFlight(FlightEnabled flight) {
        flight.takeOff();
        flight.fly();
        if(flight instanceof Tracking tracks){
            tracks.track();
        }
        flight.land();
    }

    private static void triggerFlight(List<FlightEnabled> flights) {
        for (var flight : flights) {
            flight.takeOff();
        }
    }

    private static void flyFlight(List<FlightEnabled> flights) {
        for (var flight : flights) {
            flight.fly();
        }
    }

    private static void landFlight(List<FlightEnabled> flights) {
        for (var flight : flights) {
            flight.land();
        }
    }
}
