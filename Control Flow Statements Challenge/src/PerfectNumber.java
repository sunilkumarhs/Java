public class PerfectNumber {
    public static void main(String[] args) {
        PerfectNumber.isPerfectNumber(18);
        PerfectNumber.isPerfectNumber(6);
    }
    public static boolean isPerfectNumber(int number) {
        if(number<1) {
            System.out.println("Invalid Input");
            return false;
        }else {
            int sum=0;
            for(int i=1;i<number;i++) {
                if(number%i==0) {
                    sum+=i;
                }
            }
            if(sum==number) {
                System.out.println(number+" is a perfect number");
                return true;
            }
            System.out.println(number+" is not a perfect number");
            return false;
        }
    }
}
