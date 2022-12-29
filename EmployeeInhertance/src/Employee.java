public class Employee extends Worker{
    private long employeeId;
    private String  hireDate;
    public static int employeeNo=1;

    public Employee(String name, String birthDate, String hireDate) {
        super(name, birthDate);
        this.employeeId=Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return super.toString()+"Employee{" +
                "employeeId=" + employeeId +
                ", hireDate='" + hireDate + '\'' +
                '}';
    }
}
