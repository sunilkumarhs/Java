public class Main {
    public static void main(String[] args) {
        long number=1817;
        long sumOfDigits=DigitSumChallenge.sumDigits(number);
        System.out.println("The sum of digits of number "+number+" is : "+sumOfDigits);
        System.out.println("---------------------------------------------------------------------");
        number=1728;
        sumOfDigits=DigitSumChallenge.sumDigits(number);
        System.out.println("The sum of digits of number "+number+" is : "+sumOfDigits);
        System.out.println("---------------------------------------------------------------------");
        number=-234;
        sumOfDigits=DigitSumChallenge.sumDigits(number);
        System.out.println("The sum of digits of number "+number+" is : "+sumOfDigits);
        System.out.println("---------------------------------------------------------------------");
        number=7;
        sumOfDigits=DigitSumChallenge.sumDigits(number);
        System.out.println("The sum of digits of number "+number+" is : "+sumOfDigits);
    }
}
