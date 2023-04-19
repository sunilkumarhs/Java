public class Bird extends Animal implements FlightEnabled,Tracking{

    @Override
    public void move() {
        System.out.println("Bird is Moving");
    }

    @Override
    public void takeOff() {
        System.out.println("Bird is taking off!");
    }

    @Override
    public void fly() {
        System.out.println("Bird is Flying!");
    }

    @Override
    public void land() {
        System.out.println("Bird is Landing!");
    }

    @Override
    public void track() {
        System.out.println(getClass().getName()+"'s coordinates are recorded");
    }
}
