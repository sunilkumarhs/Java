import java.util.Scanner;

public class BankAccount {
    Scanner scan = new Scanner(System.in);
    private long accNumber;
    private double balance;
    private String cusName;
    private String eMail;
    private long phoneNumber;
    public BankAccount(long accNumber,String cusName,String eMail,long phoneNumber) {
        this.accNumber=accNumber;
        this.balance=0.00;
        this.cusName=cusName;
        this.eMail=eMail;
        this.phoneNumber=phoneNumber;
    }
    public void deposit() {
        System.out.println("Enter the account number :");
        if(scan.nextLong()==this.accNumber) {
            System.out.println("Enter the amount to deposit : ");
            double amount=scan.nextDouble();
            while(amount<500){
                System.out.println("Enter amount grater that 500");
                System.out.println("Enter the amount to deposit : ");
                amount=scan.nextDouble();
            }
            balance += amount;
            System.out.println("The amount " + amount + " is credited into your account");
            System.out.println("Your new balance amount is :" + balance);
        }else {
            System.out.println("Account number is incorrect");
            scan.nextLine();
        }
    }
    public void withdraw() {
        System.out.println("Enter the account number :");
        if(scan.nextLong()==this.accNumber) {
            System.out.println("Enter the amount to withdraw : ");
            double amount=scan.nextDouble();
            if(amount<balance&&(balance-amount>=500)) {
                balance -= amount;
                System.out.println("The amount " + amount + " is withdrawal is successful please collect your amount!!");
                System.out.println("Your new balance amount is :" + balance);
            }else {
                System.out.println("Insufficient amount");
                scan.nextLine();
            }
        }else {
            System.out.println("Account number is incorrect");
            scan.nextLine();
        }
    }
    public long getAccNumber() {
        return accNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCusName() {
        return cusName;
    }

    public String geteMail() {
        return eMail;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }
}
