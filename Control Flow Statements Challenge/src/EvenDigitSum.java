public class EvenDigitSum {
    public static void main(String[] args) {
        EvenDigitSum.getEvenDigitSum(104201718);
        EvenDigitSum.getEvenDigitSum(243567);
        EvenDigitSum.getEvenDigitSum(156348);
    }
    public static long getEvenDigitSum(long number) {
        long sum=0;
        if(number<0) {
            System.out.println("Invalid Input");
            return -1;
        }else {
            while(number>0) {
                long num=number%10;
                if(num%2==0) {
                    sum+=num;
                }
                number=number/10;
            }
            System.out.println("The sum of the even digits of the number is :"+sum);
            return sum;
        }
    }
}
