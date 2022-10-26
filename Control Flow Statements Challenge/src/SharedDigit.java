public class SharedDigit {
    public static void main(String[] args) {
        SharedDigit.hasSharedDigit(17,18);
        SharedDigit.hasSharedDigit(17,28);
        SharedDigit.hasSharedDigit(17,187);
    }
    public static boolean hasSharedDigit(int num1, int num2) {
        if((num1<10 || num1>99) || (num2<10 || num2>99)) {
            System.out.println("Invalid Input");
            return false;
        }else {
            int n1=num1%10;
            num1=num1/10;
            int n2=num2%10;
            num2=num2/10;
            if(n1==n2||n1==num2||num1==n2||num1==num2) {
                System.out.println("The two numbers has shared digit");
                return true;
            }
            System.out.println("The numbers do not have shared digits");
            return false;
        }
    }
}
