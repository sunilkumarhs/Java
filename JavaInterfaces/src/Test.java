public class Test {
    public static void main(String[] args) {
//        inFlight(new Jet());
//        OrbitEarth.log("Testing"+new Satellite());
        orbit(new Satellite());
    }
//    private static void inFlight(FlightEnabled flight) {
//        flight.takeOff();
//        flight.transition(FlightStages.CRUISE);
//        flight.fly();
//        if(flight instanceof Tracking tracks){
//            tracks.track();
//        }
//        flight.land();
//    }
    private static void orbit(OrbitEarth flight) {
        flight.takeOff();
        flight.fly();
        flight.land();
    }
}
