class Satellite implements OrbitEarth{

    @Override
    public void launchOrbit() {
        System.out.println(getClass().getName()+" has launched the satellite to the earth's orbit");
    }

    @Override
    public void takeOff() {
        System.out.println(getClass().getName()+" has taken off from the launch station");
    }

    @Override
    public void fly() {
        System.out.println(getClass().getName()+" has flying towards the earth's orbit");
    }

    @Override
    public void land() {
        System.out.println(getClass().getName()+" has reached the earth's orbit");
    }
}
interface OrbitEarth extends FlightEnabled{
    void launchOrbit();
}
interface FlightEnabled {

    double KM_TO_MILES = 0.621371;
    double MILES_TO_KM = 1.60934;
    void takeOff();
    void fly();
    void land();
}
