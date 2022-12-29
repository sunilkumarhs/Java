public class SalariedEmployee extends Employee{
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate,String hireDate, double annualSalary) {
        super(name, birthDate,hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9*payCheck : payCheck;
        return (int) adjustedPay;
    }

    public void retire() {
       terminate("03-12-2030");
       isRetired = true;
    }

    @Override
    public String toString() {
        return super.toString()+"SalariedEmployee{" +
                "annualSalary=" + annualSalary +
                ", isRetired=" + isRetired +
                '}';
    }
}
