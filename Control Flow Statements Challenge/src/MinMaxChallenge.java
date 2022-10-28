import java.util.Scanner;

public class MinMaxChallenge {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int min=0;
        int max=0;
        while(true) {
            System.out.println("Enter the number :");
            boolean isNum= scan.hasNextInt();
            if(isNum) {
                int num=scan.nextInt();
                if(min==0) {
                    min = num;
                }
                if(num>max) {
                    max=num;
                }else if(num<min){
                    min=num;
                }
            }else {
                break;
            }
        }
        System.out.println("The maximum number is :"+max);
        System.out.println("The minimum number is :"+min);
    }
}
