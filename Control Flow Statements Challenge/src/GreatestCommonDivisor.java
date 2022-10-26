public class GreatestCommonDivisor {
    public static void main(String[] args) {
        GreatestCommonDivisor.getGreatestCommonDivisor(17,18);
        GreatestCommonDivisor.getGreatestCommonDivisor(12,30);
        GreatestCommonDivisor.getGreatestCommonDivisor(17,1);
    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if(first<10||second<10) {
            System.out.println("Invalid Input");
            return -1;
        }else {
            int gcd=Math.min(first,second);
            while(gcd>0) {
                if(first%gcd==0 && second%gcd==0) {
                    break;
                }
                gcd--;
            }
            System.out.println("The greatest common divisor of the given numbers is :"+gcd);
            return gcd;
        }
    }
}
