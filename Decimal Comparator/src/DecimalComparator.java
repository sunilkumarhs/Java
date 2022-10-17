public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2) {
        if ((num1 < 0 && num2 > 0) || (num1 > 0 && num2 < 0)) {
            return false;
        }
        double num1Thousand = num1 * 1000;
        double num2Thousand = num2 * 1000;
        int num1int = (int) num1Thousand;
        int num2int = (int) num2Thousand;
        if(num1int == num2int) {
            return true;
        } else {
            return false;
        }
    }
}
