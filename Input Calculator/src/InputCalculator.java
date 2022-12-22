import java.util.Scanner;

public class InputCalculator {
    public static int sum =0; //Global Variable
    public static int count=1;  //Global Variable
    public static void main(String[] args) {
        InputCalculator.inputThemPrintSumAndAverage();
    }
    public static void inputThemPrintSumAndAverage() {
        Scanner scan = new Scanner(System.in);
        long avg=0;
        boolean countValid = false;
        do {
            System.out.println("Enter the number "+count+" : ");
            try{
                count = add(scan.nextLine());
                countValid = count >= 6;
            }catch (NumberFormatException e) {
                System.out.println("Invalid Number");
            }
        }while (!countValid);

        double dAvg=(double) sum/(double) count;
        System.out.println("Average in full value is :"+dAvg);
        avg=Math.round(dAvg);
        System.out.println("The sum of the numbers is :"+sum);
        System.out.println("The average of the numbers is :"+avg);
    }

    public static int add(String num) {
        sum = sum + Integer.parseInt(num);
        count += 1;
        return count;
    }
}
