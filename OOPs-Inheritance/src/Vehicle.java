public class Vehicle {
    private double currentVelocity;
    private double currentDirection;
    final double maxDirection = 360;
    private double size;

    public Vehicle(double size) {
        this.currentVelocity = 0;
        this.currentDirection = 0;
        this.size = size;

    }

    public void direction() {
        System.out.println("The vehicle is moving in the "+currentDirection+" direction");
    }
    public void move() {
        System.out.println("Vehicle is moving at "+currentVelocity+" speed in the "+currentDirection+"degree direction");
    }

    public double getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(double currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public double getCurrentDirection() {
        return currentDirection;
    }

    public double getSize() {
        return size;
    }

    public void increaseCurrentVelocity(double inVelocity) {
        this.currentVelocity += inVelocity;
    }

    public void decreaseCurrentVelocity(double decVelocity) {
        this.currentVelocity -= decVelocity;
    }

    public void setCurrentDirection(double currentDirection) {
        this.currentDirection = currentDirection;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
