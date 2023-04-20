enum FlightStages implements Tracking{GROUNDED, LAUNCH, CRUISE, DATA_COLLECTION;

    @Override
    public void track() {
        if(this != GROUNDED) {
            System.out.println("Monitoring "+this);
        }
    }
}
record HawkFly(String name, String type) implements FlightEnabled{

    @Override
    public void takeOff() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void land() {

    }
}
public abstract class Animal {

    public abstract void move();
}
