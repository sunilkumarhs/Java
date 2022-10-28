import java.util.Scanner;

public class InputCalculator {
    public static void main(String[] args) {
        InputCalculator.inputThemPrintSumAndAverage();
    }
    public static void inputThemPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        int sum=0;
        long avg=0;
        int count=0;
        System.out.println("Enter the numbers :");
        while(true) {
            boolean isInt=scan.hasNextInt();
            if(isInt) {
                int num = scan.nextInt();
                sum+=num;
                count+=1;
            }else {
                break;
            }
        }
        double davg=(double) sum/(double) count;
        System.out.println("Average in full value is :"+davg);
        avg=Math.round(davg);
        System.out.println("The sum of the numbers is :"+sum);
        System.out.println("The average of the numbers is :"+avg);
    }
}
