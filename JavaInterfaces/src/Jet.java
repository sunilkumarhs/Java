public class Jet implements FlightEnabled,Tracking{
    @Override
    public void takeOff() {
        System.out.println("Jet is TakingOff from Base");
    }

    @Override
    public void fly() {
        System.out.println("Jet is Flying!");
    }

    @Override
    public void land() {
        System.out.println("Jet Landed at the Base");
    }

    @Override
    public void track() {
        System.out.println(getClass().getName()+"'s co-ordinates are recorded");
    }

    @Override
    public FlightStages transition(FlightStages stage) {
        System.out.println(getClass().getName()+" transitioning");
        return FlightEnabled.super.transition(stage);
    }
}
