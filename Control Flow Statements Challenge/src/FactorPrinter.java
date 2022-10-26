public class FactorPrinter {
    public static void main(String[] args) {
        FactorPrinter.printFactors(18);
        System.out.println("----------------------------------------------------------------------------------------");
        FactorPrinter.printFactors(17);
    }
    public static void printFactors(int number) {
        if(number<1) {
            System.out.println("Invalid Value");
        }else {
            System.out.println("The Factors that divides the "+number+" wholly is : ");
            for(int i=1;i<=number;i++) {
                if(number%i==0) {
                    System.out.println(i);
                }
            }
        }
    }
}
