import java.util.ArrayList;
import java.util.Scanner;
record Customer(String name, ArrayList<Double> transactions){
    public Customer(String name, double initialAmount) {
        this(name.toUpperCase(),
                new ArrayList<>(100));
        transactions.add(initialAmount);
    }
}
public class BoxingChallenge {
    public static void main(String[] args) {
        Bank bank = new Bank("SBI");
        Scanner scan = new Scanner(System.in);
        while(true) {
            System.out.println("1.New Customer \n 2.Make Transactions \n 3.View Customer Details \n 4. Quit");
            System.out.println("Enter the process you need to perform: ");
            int pro = scan.nextInt();
            switch (pro) {
                case 1 -> {
                    System.out.printf("Welcome to %s Banking Application %n",bank.bankName);
                    System.out.println("Enter your name: ");
                    String name = scan.next();
                    System.out.println("Enter the initial amount greater than or equal to 500Rs to deposit initially:");
                    double initialAmount = scan.nextDouble();
                    while(initialAmount < 500) {
                        System.out.println("Enter amount greater than or equal to 500Rs to deposit initially :");
                        initialAmount = scan.nextDouble();
                    }
                    bank.addCustomer(name,initialAmount);
                    System.out.printf("Thank You for Opening Account in %s Bank!! %n",bank.bankName);
                }
                case 2 -> {
                    System.out.println("Enter your nameId for making transactions :");
                    String name = scan.next();
                    if (bank.checkCustomer(name)) {
                        System.out.printf("Welcome to %s Banking Application %n",bank.bankName);
                        System.out.println("Your Transaction can be done here :");
                        int trans;
                        do {
                            System.out.println("1.Credit \n 2.Debit \n 3.Quit");
                            System.out.println("Enter the mode of the transaction :");
                            trans = scan.nextInt();
                            switch (trans) {
                                case 1:
                                    System.out.println("Enter the amount you need to credit :");
                                    double amount = scan.nextDouble();
                                    bank.creditTransaction(name,amount);
                                    break;
                                case 2:
                                    System.out.println("Enter the amount you need to debit :");
                                    amount = scan.nextDouble();
                                    bank.debitTransaction(name,amount);
                                    break;
                                case 3:
                                    System.out.println("Thanks for making transactions!!");
                                default:
                                    System.out.println("Enter the proper value!!");
                            }
                        } while (trans != 3);
                    }
                }
                case 3 -> {
                    System.out.printf("Welcome to %s Banking Application %n",bank.bankName);
                    System.out.println("Enter your name to view your details: ");
                    String name = scan.next();
                    bank.viewCustomer(name);
                }
                case 4 -> System.exit(0);
                default -> System.out.println("Enter the proper value!!");
            }

        }
    }
}
class Bank {
    String bankName;
    ArrayList<Customer> Customers = new ArrayList<>(100);
    public Bank(String name) {
        this.bankName=name;
    }
    private Customer getCustomer(String customerName) {
        for(var customer : Customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return customer;
            }
        }
        return null;
    }

    public Boolean checkCustomer(String customerName) {
        for(var customer : Customers) {
            if(customer.name().equalsIgnoreCase(customerName)) {
                return true;
            }
        }
        System.out.printf("%s, you have no bank account in %s Bank, Please open the account to continue!! %n", customerName,bankName);
        return false;
    }
    public Customer addCustomer(String customerName, double initialDeposit) {
        if(getCustomer(customerName)==null) {
            Customer customer = new Customer(customerName,initialDeposit);
            Customers.add(customer);
            System.out.printf("Account successfully created in the name of %s %n", customerName);
        } else {
            System.out.println("Account already exits in this bank!!");
        }
        return null;
    }
    public Customer viewCustomer(String customerName) {
        Customer customer = getCustomer(customerName);
        double totalAmount = 0;
        if(customer!= null) {
            System.out.println("Customer Details");
            System.out.println("Name : "+customer.name());
            System.out.println("Transaction Details : ");
            for(double a : customer.transactions()) {
                System.out.printf("₹%10.2f (%s) %n",a,a < 0 ? "debit" : "credit");
            }
            for(double amount : customer.transactions()) {
                totalAmount += amount;
            }
            System.out.println("Total Amount : ₹"+totalAmount);
        } else {
            System.out.printf("%s, you have no bank account in this Bank, Please open the account to continue!! %n", customerName);
        }
        return null;
    }

    public Customer creditTransaction(String name, double depositAmount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(depositAmount);
            System.out.println("Amount credited successfully!!");
        } else {
            System.out.println("Wrong Customer name!!");
        }
        return null;
    }

    public Customer debitTransaction(String name, double withdrawAmount) {
        Customer customer = getCustomer(name);
        if(customer != null) {
            customer.transactions().add(-withdrawAmount);
            System.out.println("Amount debited successfully!!");
        } else {
            System.out.println("Wrong Customer name!!");
        }
        return null;
    }
}
