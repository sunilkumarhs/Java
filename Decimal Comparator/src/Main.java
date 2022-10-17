public class Main {
    public static void main(String[] args) {
        System.out.println("Decimal Comparator");
        boolean decimal=DecimalComparator.areEqualByThreeDecimalPlaces(12.345,12.34534);
        if(decimal) {
            System.out.println("The given two numbers are equal");
        }else {
            System.out.println("The given numbers sre not equal");
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Equal Sum Checker");
        boolean sum = EqualSumChecker.hasEqualSum(17,18,35);
        if(sum) {
            System.out.println("The sum of the first two numbers is equal to the third number");
        }else {
            System.out.println("The sum of the first two numbers is not equal to the third number");
        }
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Teen Number Checker");
        boolean teens = TeenNumberChecker.hasTeen(12,24,15);
        boolean teen = TeenNumberChecker.isTeen(45);
        if(teens) {
            System.out.println("One of the three numbers one number is teen number");
        }
        else {
            System.out.println("No number is teen number");
        }
        if(teen) {
            System.out.println("Number is teen number");
        }
        else {
            System.out.println("Number is not teen numbers");
        }
    }
}
