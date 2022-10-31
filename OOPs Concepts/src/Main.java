import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mChoice,choice;
        do{
            System.out.println("1:CarClass \n 2:BankAccount \n 3.Exit");
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
                    BankAccount ba = new BankAccount();
                    ba.setAccNumber(1718010420);
                    ba.setCusName("SunilKumarHS");
                    ba.seteMail("sunilkumarhs97@gmail.com");
                    ba.setPhoneNumber(123456789);
                    ba.setBalance(0);
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
                    System.out.println("Exiting from Program!!!");
                    break;
                default:
                    System.out.println("Invalid Input");
            }
        }while(mChoice!=3);
    }
}
