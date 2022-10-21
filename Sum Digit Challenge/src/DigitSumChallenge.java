public class DigitSumChallenge {
    public static long sumDigits(long number) {
        if(number<10) {
            return -1;
        }
        long sum=0;
        while(number>0) {
            sum+=number%10;
            number/=10;
        }
        return sum;

    }
}
