public class Car {
    private boolean engine;
    private int cylinders;
    private int wheels;
    private String name;
    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public void startEngine() {
        System.out.println("Car is not Started");
    }

    public void accelerate() {
        System.out.println("Car is not moving");
    }

    public void brake() {
        System.out.println("Brake is not applied");
    }

    public boolean isEngine() {
        return engine;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getWheels() {
        return wheels;
    }

    public String getName() {
        return name;
    }
}

class TataHarrier extends Car {
    public TataHarrier() {
        super(4,"Tata-Harrier");
    }
    public void startEngine() {
        System.out.println(getName()+" car engine is started");
    }
    public void accelerate() {
        System.out.println(getName()+" is moving at 120km/h");
    }
    //No Break
}
class xuv extends Car {
    public xuv() {
        super(3,"Mahendra-XUV7oo");
    }

    public void startEngine() {
        System.out.println(getName()+" car engine is started");
    }
   //No Acceleration
    public void brake(){
        System.out.println("Car is stopped comfortably");
    }
}
class jaguar extends Car {
    public jaguar() {
        super(6,"Jaguar");
    }
    public void startEngine() {
        System.out.println(getName()+" car engine is started");
    }
    public void accelerate() {
        System.out.println(getName()+" is moving at 200km/h");
    }
    public void brake(){
        System.out.println("Car is stopped");
    }
}