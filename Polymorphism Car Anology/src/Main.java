public class Main {
    public static void main(String[] args) {
        Car car1 = new TataHarrier();
        System.out.println(car1.getName()+"has "+car1.getCylinders()+" cylinders powered engine");
        car1.startEngine();
        car1.accelerate();
        car1.brake();
        System.out.println("\n");
        Car car2 = new xuv();
        System.out.println(car2.getName()+"has "+car2.getCylinders()+" cylinders powered engine");
        car2.startEngine();
        car2.accelerate();
        car2.brake();
        System.out.println("\n");
        Car car3 = new jaguar();
        System.out.println(car3.getName()+"has "+car3.getCylinders()+" cylinders powered engine");
        car3.startEngine();
        car3.accelerate();
        car3.brake();
    }
}
