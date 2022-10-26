public class LastDigitChecker {
    public static void main(String[] args) {
        LastDigitChecker.hasSameLastDigit(17,18,28);
        LastDigitChecker.hasSameLastDigit(17,18,23);
        LastDigitChecker.hasSameLastDigit(171,12234,344);
    }
    public static boolean hasSameLastDigit(int num1, int num2, int num3) {
        if((num1<10||num1>1000)||(num2<10||num2>1000)||(num3<10||num3>1000)) {
            System.out.println("Invalid Input");
            return false;
        }else {
            int n1=num1%10;
            int n2=num2%10;
            int n3=num3%10;
            if(n1==n2||n2==n3||n1==n3)  {
                System.out.println("The last digits of the numbers has same digits");
                return true;
            }
            System.out.println("The last digits of the numbers do not have same digits");
            return false;
        }
    }
    public static boolean isValid(int num) {
        if(num<10||num>1000) {
            return false;
        }else {
            return true;
        }
    }
}
