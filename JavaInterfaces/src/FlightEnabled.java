
class Satellite implements OrbitEarth{

    FlightStages stage = FlightStages.GROUNDED;
    @Override
    public void launchOrbit() {
        System.out.println(getClass().getName()+" has launched the satellite to the earth's orbit");
        transition("Orbit achieved ");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getName()+" has taken off from the launch station");
        transition("Taking off");
    }

    @Override
    public void fly() {
        launchOrbit();
        System.out.println(getClass().getName()+" has flying towards the earth's orbit");
        transition("Data collection while orbiting");
    }

    @Override
    public void land() {
        System.out.println(getClass().getName()+" has reached the earth's orbit");
        transition("landing");
    }

    public void transition(String description) {
        System.out.println(description);
        stage=transition(stage);
        stage.track();
    }
}
interface OrbitEarth extends FlightEnabled{
    void launchOrbit();
    private static void log(String description) {
        var today = new java.util.Date();
        System.out.println("Today's date is "+today+":"+description);
    }
    private static void logStages(FlightStages stage, String description) {
        description = stage+":"+description;
        log(description);
    }
    default FlightStages transition(FlightStages stage) {
        FlightStages nextStage = FlightEnabled.super.transition(stage);
        logStages(stage,"Beginning transition to "+nextStage);
        return nextStage;
    }
}
interface FlightEnabled {

    double KM_TO_MILES = 0.621371;
    double MILES_TO_KM = 1.60934;
    void takeOff();
    void fly();
    void land();

    default FlightStages transition(FlightStages stage){
//        System.out.println("Transition is done on "+getClass().getName());
//        return null;
        FlightStages nextStage = stage.getNextStages();
        System.out.println("Transitioning from "+stage+" to "+nextStage);
        return nextStage;
    }
}
