import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Printer printer = new Printer();
        while(true) {
            System.out.println("1.Fill Toner \n 2.Print Pages \n 3.exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    printer.addToner();
                    break;
                case 2:
                    printer.print();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Enter the proper option!!");
            }
        }
    }
}
