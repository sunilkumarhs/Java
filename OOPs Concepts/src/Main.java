import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mChoice,choice;
        do{
            System.out.println("1:Car Class \n 2:BankAccount Class \n 3.VipCustomer Class \n 4.WallArea Class \n 5.Point Class \n 6.Exit");
            System.out.println("Enter Your choice :");
            mChoice = scan.nextInt();
            switch (mChoice) {
                case 1:
                    Car mahendra = new Car();
                    Car tata = new Car();
                    mahendra.setColour("blue");
                    mahendra.setDoors(5);
                    mahendra.setEngine("MHawk2000");
                    mahendra.setModel("XUV700");
                    mahendra.setSeats(7);
                    System.out.println("The details of the Mahendra car is :");
                    System.out.println("The model of the car is : " + mahendra.getModel());
                    System.out.println("Colour :" + mahendra.getColour());
                    System.out.println("Number of doors is : " + mahendra.getDoors());
                    System.out.println("Engine : " + mahendra.getEngine());
                    System.out.println("Number of seats in car is : " + mahendra.getSeats());
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    tata.setSeats(4);
                    tata.setModel("Nexon");
                    tata.setEngine("TataDualBoost");
                    tata.setDoors(1);
                    tata.setColour("Black");
                    System.out.println("The details of the TATA car is : ");
                    System.out.println("The model of the car is : " + tata.getModel());
                    System.out.println("Colour :" + tata.getColour());
                    System.out.println("Number of doors is : " + tata.getDoors());
                    System.out.println("Engine : " + tata.getEngine());
                    System.out.println("Number of seats in car is : " + tata.getSeats());
                    break;
                case 2:
                    BankAccount ba = new BankAccount(1718010420,"SunilKumarHS","sunilhs97@gmil.com",123456789);
                    System.out.println("Account Number is :" + ba.getAccNumber());
                    System.out.println("Name of the account holder is :" + ba.getCusName());
                    System.out.println("Phone Number is :" + ba.getPhoneNumber());
                    do{
                        System.out.println("1:Deposit \n 2:withdraw \n 3:Balance \n 4:Exit");
                        System.out.println("Enter your choice :");
                        choice = scan.nextInt();
                        switch (choice) {
                            case 1:
                                ba.deposit();
                                break;
                            case 2:
                                ba.withdraw();
                                break;
                            case 3:
                                System.out.println("The Balance of the account "+ba.getAccNumber()+" is :"+ba.getBalance());
                                break;
                            case 4:
                                System.out.println("Exiting from Bank Account class");
                                break;
                            default:
                                System.out.println("Invalid Input");
                        }
                    }while(choice!=4);
                    break;
                case 3:
                    VipCustomer vp1=new VipCustomer();
                    System.out.println("The details of the default vip customer is :");
                    System.out.println("Name :"+vp1.getName()+"\n"
                                       +"Credit Limit is :"+vp1.getCreditLimit()+"\n"
                                       +"Email address is :"+vp1.getEmail());
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    VipCustomer vp2=new VipCustomer("Varun","varun@gmail.com");
                    System.out.println("The details of the 2 parameter vip customer is :");
                    System.out.println("Name :"+vp2.getName()+"\n"
                                      +"Credit Limit is :"+vp2.getCreditLimit()+"\n"
                                      +"Email address is :"+vp2.getEmail());
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(" ");
                    VipCustomer vp3=new VipCustomer("Raju",50000,"raju@gmail.com");
                    System.out.println("The details of the 3 parameter vip customer is :");
                    System.out.println("Name :"+vp3.getName()+"\n"
                            +"Credit Limit is :"+vp3.getCreditLimit()+"\n"
                            +"Email address is :"+vp3.getEmail());
                    break;
                case 4:
                    WallArea wa=new WallArea();
                    WallArea wa1=new WallArea(17,-5);
                    System.out.println("The value of the width of the wall is : "+wa1.getWidth());
                    System.out.println("The value of the height of the wall is : "+wa1.getHeight());
                    System.out.println("The area of the wall is  : "+wa1.getArea());
                    break;
                case 5:
                    Point first = new Point(6, 5);
                    Point second = new Point(3, 1);
                    System.out.println("distance(0,0)= " + first.distance());
                    System.out.println("distance(second)= " + first.distance(second));
                    System.out.println("distance(2,2)= " + first.distance(2, 2));
                    Point point = new Point(1,-1);
                    System.out.println("distance()= " + point.distance());
                    System.out.println("distance(Point p) = "+second.distance(point));
                    break;
                case 6:
                    System.out.println("Exiting from Program!!!");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(mChoice!=6);
    }
}
