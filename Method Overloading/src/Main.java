public class Main {
    public static void main(String[] args) {
        double centiMeter=FeetInchesConversion.calcFeetAndInchesToCentimeters(82);
        System.out.println("The converted centimeter is :"+centiMeter);
        System.out.println("---------------------------------------------------------------------");
        centiMeter=FeetInchesConversion.calcFeetAndInchesToCentimeters(8,5);
        if(centiMeter==-1) {
            System.out.println("Invalid Values");
        }else {
            System.out.println("The converted centimeter is :" + centiMeter);
        }
        System.out.println("---------------------------------------------------------------------");
        FeetInchesConversion.calcFeetAndInchesToCentimeters(8,13);
        System.out.println("---------------------------------------------------------------------");
        FeetInchesConversion.calcFeetAndInchesToCentimeters(360);
    }
}
