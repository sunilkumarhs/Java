import java.util.Scanner;

public class SUV extends Car{
    Scanner scan = new Scanner(System.in);
    private String name;
    private String color;
    private double maxSpeed;
    private boolean applyBreak;
    private double accelerate;
    private boolean start;
    private boolean doorLock;
    private String fuelType;
    private double breakValue;

    public SUV(boolean isManual, int maxFuel, String name, String color, double maxSpeed, String fuelType) {
        super(5, 6, isManual,5, maxFuel);
        this.name = name;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.applyBreak =false;
        this.accelerate = 0;
        this.start = false;
        this.doorLock = false;
        this.fuelType=fuelType;
        this.breakValue=0;
    }

    public void startCar(){
        System.out.println("please enter 'true' to close the door!!");
        doorLock = scan.nextBoolean();
        if(doorLock) {
            System.out.println("please enter 'true' to start the car!!");
            start = scan.nextBoolean();
            if(start) {
                if(getFuelGage()==0){
                    displayFuelGage();
                    addFuel();
                }else {
                    System.out.println("Car is Started!!");
                    displayFuelGage();
                    this.setCurrentVelocity(0);
                    this.setCurrentDirection(0);
                    this.setCurrentGear(0);
                    move();
                    if (isManual()) {
                        System.out.println("Enter the push gear value!!");
                        int pushGear = scan.nextInt();
                        changeGear(pushGear);
                        moveDirection();
                    } else {
                        moveDirection();
                    }
                }
            }else {
                System.out.println("please enter 'ture'!!");
                startCar();
            }
        } else {
            System.out.println("please enter 'ture'!!");
            startCar();
        }
    }

    public void addFuel() {
        System.out.println("enter the fuel value to start car!!");
        int fuel = scan.nextInt();
        if((fuel+getFuelGage())>getMaxFuel()) {
            System.out.println("Fuel is more to store in the car fuel tank, enter proper fuel value!!");
            addFuel();
        }
        else {
            setFuelGage(fuel);
            displayFuelGage();
            startCar();
        }
    }

    public void acceleration() {
        if(getCurrentVelocity() == maxSpeed) {
            System.out.println("!!reached the maximum speed of the car!!");
            System.out.println("Please apply the break, !!max speed is not good to drive!!");
            applyingBreak();
        }else {
            System.out.println("Enter the accelerate value !!");
            accelerate = scan.nextDouble();
            if (accelerate + getCurrentVelocity() <= maxSpeed) {
                increaseCurrentVelocity(accelerate);
                move();
                System.out.println("Please enter 'true' to apply the break!! OR !!enter 'false' to continue the drive!!");
                applyBreak = scan.nextBoolean();
                if (applyBreak) {
                    applyingBreak();
                } else {
                    acceleration();
                }
            } else {
                System.out.println("!!enter the proper accelerate value!!");
                acceleration();
            }
        }
    }

    public void moveDirection() {
        System.out.println("Enter the direction value!!");
        double direction = scan.nextDouble();
        if(direction <= maxDirection) {
            setCurrentDirection(direction);
            acceleration();
        }else {
            System.out.println("!!enter the proper direction value!!");
            moveDirection();
        }
    }

    public void applyingBreak() {
        System.out.println("Enter the value of the break!! OR !!Enter max break value to stop the car!!");
        this.breakValue = scan.nextDouble();
        if(this.breakValue <= getCurrentVelocity()) {
            if(this.breakValue == getCurrentVelocity()) {
                System.out.println(" !!Car is stopping !! ");
                setCurrentVelocity(0);
                System.out.println("Please enter 'true' to continue driving OR !!enter 'false' to exit from car");
                boolean choice = scan.nextBoolean();
                if(choice) {
                    move();
                    acceleration();
                }else {
                    System.out.println("Exited from car");
                    System.exit(0);
                }
            }else {
                decreaseCurrentVelocity(breakValue);
                move();
                acceleration();
            }
        }else {
            System.out.println("!!Enter proper break value!!");
            move();
            applyingBreak();
        }

    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isApplyBreak() {
        return applyBreak;
    }

    public double getAccelerate() {
        return accelerate;
    }

    public boolean isStart() {
        return start;
    }

    public boolean isDoorLock() {
        return doorLock;
    }

    public String getFuelType() {
        return fuelType;
    }
}
