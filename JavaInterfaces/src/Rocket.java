public class Rocket extends Satellite implements Tracking{
    @Override
    public void launchOrbit() {
        super.launchOrbit();
    }

    @Override
    public void takeOff() {
        super.takeOff();
    }

    @Override
    public void fly() {
        super.fly();
    }

    @Override
    public void land() {
        super.land();
    }

    @Override
    public void track() {
        System.out.println(getClass().getName()+"'s co-ordinates are recorded");
    }
}
