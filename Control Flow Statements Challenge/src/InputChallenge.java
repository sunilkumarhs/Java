import java.util.Scanner;

public class InputChallenge {
    public static void main(String[] args) {
        int sum = 0;
        int count=1;
        Scanner scan=new Scanner(System.in);
        while(count<=10) {
            System.out.println("Enter the number "+count+" : ");
            boolean ifNum=scan.hasNextInt();
            if(ifNum) {
                int num=scan.nextInt();
                sum+=num;
                count+=1;
            }else {
                System.out.println("Invalid Input");
            }
            scan.nextLine();
        }
        System.out.println("The sum of the input numbers is :"+sum);
        scan.close();
    }
}
