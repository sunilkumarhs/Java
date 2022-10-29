public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;
    public void setFirstNumber(double firstNumber) {
        this.firstNumber=firstNumber;
    }
    public void setSecondNumber(double secondNumber) {
        this.secondNumber=secondNumber;
    }
    public double getFirstNumber() {
        return this.firstNumber;
    }
    public double getSecondNumber() {
        return this.secondNumber;
    }
    public double getAdditionResult() {
        double sum=this.firstNumber+this.secondNumber;
        return sum;
    }
    public double getSubtractionResult() {
        double min=this.firstNumber-this.secondNumber;
        return min;
    }
    public double getMultiplicationResult() {
        double mul=this.firstNumber*this.secondNumber;
        return mul;
    }
    public double getDivisionResult() {
        if(this.secondNumber==0) {
            return 0;
        }else {
            double div=this.firstNumber/this.secondNumber;
            return div;
        }
    }
}
