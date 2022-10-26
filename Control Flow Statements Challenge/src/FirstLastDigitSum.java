public class FirstLastDigitSum {
    public static void main(String[] args) {
        FirstLastDigitSum.sumFirstAndLastDigit(1718);
        FirstLastDigitSum.sumFirstAndLastDigit(17);
        FirstLastDigitSum.sumFirstAndLastDigit(7);
    }
    public static int sumFirstAndLastDigit(int number) {
        int sum=0;
        if(number<0) {
            System.out.println("Invalid Input");
            return -1;
        }
        if(number<10) {
            sum=number+number;
            System.out.println("The sum of the last and first digit of the number is :"+sum);
            return sum;
        }else if(number<100) {
            int num=number%10;
            number=number/10;
            sum=number+num;
            System.out.println("The sum of the last and first digit of the number is :"+sum);
            return sum;
        }else {
            int num=number%10;
            while(number>9) {
                number=number/10;
            }
            sum=number+num;
            System.out.println("The sum of the last and first digit of the number is :"+sum);
            return sum;
        }
    }
}
