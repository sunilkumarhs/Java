import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SUV xuv = new SUV(14,false,150,"Mahindra","XUV7OO","white",220,"Petrol");
        SUV safari = new SUV(14.5,false,120,"Tata","Safari Advance","Blue",210,"Diesel");
        SUV thar = new SUV(13.45,false,180,"Mahindra","Thar mHawk","Grey",200,"Diesel");
        SUV nexon = new SUV(12.5,false,100,"Tata","Nexon EV","Red",230,"Electric");
        SUV scorpio = new SUV(13.96,false,160,"Mahindra","Scorpio NG","Black",240,"Diesel");
        System.out.println("1.XUV \n 2.Safari \n 3.Thar \n 4.Nexon \n 5.Scorpio");
        System.out.println("Please choose the car to drive!!");
        int choice = scan.nextInt();
        switch (choice) {
            case 1:
                System.out.println("The details of the car you chose is :");
                System.out.println("Car Model is : "+xuv.getName()+"\n"
                        +"This car is tha product of "+xuv.getCompany()+" company \n"
                        +"Car Color is : "+xuv.getColor()+"\n"
                        +"Fuel type is : "+xuv.getFuelType()+"\n"
                        +"Car length is : "+xuv.getSize()+"\n"
                        +"Car maximum fuel capacity is : "+xuv.getMaxFuel()+"\n"
                        +"Car has "+xuv.getGears()+" Speed gear transmission \n"
                        +"car has "+xuv.getDoors()+" Doors \n"
                        +"car has "+xuv.getWheels()+" Wheels \n"
                        +"Maximum Speed is : "+xuv.getMaxSpeed());
                System.out.println("Are you ready to drive the car!!");
                xuv.startCar();
                break;
            case 2:
                System.out.println("The details of the car you chose is :");
                System.out.println("Car Model is : "+safari.getName()+"\n"
                        +"This car is tha product of "+safari.getCompany()+" company \n"
                        +"Car Color is : "+safari.getColor()+"\n"
                        +"Fuel type is : "+safari.getFuelType()+"\n"
                        +"Car length is : "+safari.getSize()+"\n"
                        +"Car maximum fuel capacity is : "+safari.getMaxFuel()+"\n"
                        +"Car has "+safari.getGears()+" Speed gear transmission \n"
                        +"car has "+safari.getDoors()+" Doors \n"
                        +"car has "+safari.getWheels()+" Wheels \n"
                        +"Maximum Speed is : "+safari.getMaxSpeed());
                System.out.println("Are you ready to drive the car!!");
                safari.startCar();
                break;
            case 3:
                System.out.println("The details of the car you chose is :");
                System.out.println("Car Model is : "+thar.getName()+"\n"
                        +"This car is tha product of "+thar.getCompany()+" company \n"
                        +"Car Color is : "+thar.getColor()+"\n"
                        +"Fuel type is : "+thar.getFuelType()+"\n"
                        +"Car length is : "+thar.getSize()+"\n"
                        +"Car maximum fuel capacity is : "+thar.getMaxFuel()+"\n"
                        +"Car has "+thar.getGears()+" Speed gear transmission \n"
                        +"car has "+thar.getDoors()+" Doors \n"
                        +"car has "+thar.getWheels()+" Wheels \n"
                        +"Maximum Speed is : "+thar.getMaxSpeed());
                System.out.println("Are you ready to drive the car!!");
                thar.startCar();
                break;
            case 4:
                System.out.println("The details of the car you chose is :");
                System.out.println("Car Model is : "+nexon.getName()+"\n"
                        +"This car is tha product of "+nexon.getCompany()+" company \n"
                        +"Car Color is : "+nexon.getColor()+"\n"
                        +"Fuel type is : "+nexon.getFuelType()+"\n"
                        +"Car length is : "+nexon.getSize()+"\n"
                        +"Car maximum fuel capacity is : "+nexon.getMaxFuel()+"\n"
                        +"Car has "+nexon.getGears()+" Speed gear transmission \n"
                        +"car has "+nexon.getDoors()+" Doors \n"
                        +"car has "+nexon.getWheels()+" Wheels \n"
                        +"Maximum Speed is : "+nexon.getMaxSpeed());
                System.out.println("Are you ready to drive the car!!");
                nexon.startCar();
                break;
            case 5:
                System.out.println("The details of the car you chose is :");
                System.out.println("Car Model is : "+scorpio.getName()+"\n"
                        +"This car is tha product of "+scorpio.getCompany()+" company \n"
                        +"Car Color is : "+scorpio.getColor()+"\n"
                        +"Fuel type is : "+scorpio.getFuelType()+"\n"
                        +"Car length is : "+scorpio.getSize()+"\n"
                        +"Car maximum fuel capacity is : "+scorpio.getMaxFuel()+"\n"
                        +"Car has "+scorpio.getGears()+" Speed gear transmission \n"
                        +"car has "+scorpio.getDoors()+" Doors \n"
                        +"car has "+scorpio.getWheels()+" Wheels \n"
                        +"Maximum Speed is : "+scorpio.getMaxSpeed());
                System.out.println("Are you ready to drive the car!!");
                scorpio.startCar();
                break;
            default :
                System.out.println("Invalid car number");
                break;
        }
    }
}
