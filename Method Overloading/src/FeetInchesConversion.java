public class FeetInchesConversion {
    public static double calcFeetAndInchesToCentimeters(int feet, double inches) {
        if(feet<0 || (inches<0 || inches>12)) {
            System.out.println("Invalid Values");
            return -1;
        }
        double newinches = feet*12;
        newinches+=inches;
        double centimeter= newinches*2.54;
        System.out.println("The value of "+feet+" feet and "+inches+" inches in centimeter is : "+centimeter);
        return centimeter;
    }
    public static double calcFeetAndInchesToCentimeters(double inches) {
        if(inches <0) {
            System.out.println("Invalid Values");
            return -1;
        }
        int feet = (int)inches/12;
        double reminches = (int)inches%12;
        System.out.println("The Inches"+inches+"after the conversion is :"+feet+" feet and "+reminches+" inches");
        return calcFeetAndInchesToCentimeters(feet,reminches);
    }
}
