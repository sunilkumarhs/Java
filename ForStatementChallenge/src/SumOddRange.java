public class SumOddRange {
    public static void main(String[] args) {
        SumOddRange.sumOdd(1,17);
        System.out.println("---------------------------------------------------------------------");
        SumOddRange.sumOdd(7,18);
    }
    public static boolean isOdd(int number) {
        if(number<0) {
            return false;
        }
        if(number%2==0){
            return false;
        }
        return true;
    }
    public static int sumOdd(int start, int end) {
        int sum=0;
        if(start<=0||end<start) {
            return -1;
        }
        System.out.println("The odd numbers are : ");
        for(int i=start;i<=end;i++) {
            if(isOdd(i)) {
                System.out.println("Number found :"+i);
                sum+=i;
            }
        }
        System.out.println("The sum of the odd numbers in the range "+start+" to "+end+" is : "+sum);
        return sum;
    }
}
