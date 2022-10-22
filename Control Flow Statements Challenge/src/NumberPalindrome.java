public class NumberPalindrome {
    public static void main(String[] args) {
        NumberPalindrome.isPalindrome(121);
        System.out.println("------------------------------------------------------");
        NumberPalindrome.isPalindrome(1718);
    }
    public static boolean isPalindrome(int number) {
        if(number<0) {
            number=Math.abs(number);
        }
        int number1=number;
        int reverse=0;
        while(number>0) {
            int lastDigit=number%10;
            reverse*=10;
            reverse+=lastDigit;
            number/=10;
        }
        if(number1==reverse) {
            System.out.println("The number "+number1+" is palindrome");
            return true;
        } else {
            System.out.println("The number "+number1+" is not a palindrome");
            return false;
        }
    }

}
