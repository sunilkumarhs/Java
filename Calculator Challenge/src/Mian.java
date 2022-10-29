public class Mian {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.setFirstNumber(18);
        calculator.setSecondNumber(17);
        System.out.println("addition= " + calculator.getAdditionResult());
        System.out.println("subtraction= " + calculator.getSubtractionResult());
        System.out.println("multiplication= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());
        calculator.setFirstNumber(1);
        calculator.setSecondNumber(0);
        System.out.println("multiplication= " + calculator.getMultiplicationResult());
        System.out.println("division= " + calculator.getDivisionResult());
    }
}
