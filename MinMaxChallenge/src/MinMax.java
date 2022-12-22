import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        MinMax.calculateMinMax();
    }
    public static void calculateMinMax() {
        Scanner scan = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter the numbers to find min and max:");
        while(true) {
            boolean isInt = scan.hasNextInt();
            if(isInt) {
                int num = scan.nextInt();
                if(num > max) {
                    max = num;
                }
                if (num < min) {
                    min = num;
                }
            }else{
                break;
            }
        }
        System.out.println("The Minimum Number is: "+min);
        System.out.println("The Maximum Number is: "+max);
    }
}
