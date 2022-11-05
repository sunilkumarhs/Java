public class Main {
    public static void main(String[] args) {
        SUV xuv = new SUV(false,150,"XUV7OO","Blue",220,"Diesel");
        System.out.println("The details of the car is :");
        System.out.println("Car Model is : "+xuv.getName()+"\n"
                          +"Car Color is : "+xuv.getColor()+"\n"
                          +"Fuel type is : "+xuv.getFuelType()+"\n"
                          +"Maximum Speed is : "+xuv.getMaxSpeed());
        xuv.startCar();
    }
}
