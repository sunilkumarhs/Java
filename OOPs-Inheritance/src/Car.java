import java.util.Scanner;

public class Car extends Vehicle {
    Scanner scan = new Scanner(System.in);
    private int doors;
    private int gears;
    private int currentGear;
    private boolean isManual;
    private int wheels;
    private int fuelGage;
    private int maxFuel;
    public SUV s;

    public Car(int doors, int gears, boolean isManual, int wheels, int maxFuel) {
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 0;
        this.isManual = isManual;
        this.wheels = wheels;
        this.fuelGage = 0;
        this.maxFuel = maxFuel;
    }

    public void changeGear(int pushGear){
        if(pushGear == 1 && (pushGear+currentGear)<=gears) {
            this.currentGear += pushGear;
        }
        else {
            System.out.println("!!Invalid Gear Transmission!!");
            System.out.println("enter the proper gear value!!");
            pushGear = scan.nextInt();
            changeGear(pushGear);
        }
    }

    public void displayFuelGage() {
        System.out.println("The Car having "+fuelGage+"L out of the max "+maxFuel+"L");
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setFuelGage(int fuelGage) {
        this.fuelGage = fuelGage;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public int getDoors() {
        return doors;
    }

    public int getGears() {
        return gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public boolean isManual() {
        return isManual;
    }

    public int getWheels() {
        return wheels;
    }

    public int getFuelGage() {
        return fuelGage;
    }

    public int getMaxFuel() {
        return maxFuel;
    }
}
