public class ForStatements {
    public static void main(String[] args) {
        for(int i=1;i<=8;i++) {
            System.out.println("55,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(55000,i)));
        }
        System.out.println("----------------------------------------------------------------------------------------");
        for(int i=8;i>=2;i--) {
            System.out.println("55,000 at "+i+"% interest = "+String.format("%.2f",calculateInterest(55000,i)));
        }
    }
    public static double calculateInterest(double amount,double interestRate) {
        return (amount*(interestRate/100));
    }
}
