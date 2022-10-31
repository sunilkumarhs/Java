public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;
    public VipCustomer(){
        this.name="Ajay";
        this.creditLimit=20000;
        this.email="ajay123@gmail.com";
    }
    public VipCustomer(String name,String email) {
        this.name=name;
        this.creditLimit=250000;
        this.email=email;
    }
    public VipCustomer(String name,double creditLimit,String email) {
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
