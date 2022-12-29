public class Main {
    public static void main(String[] args) {
        SalariedEmployee semp1 = new SalariedEmployee("Sunil", "01-04-2000", "02-06-2023", 50000);
        System.out.println("Employee details:");
        System.out.println(semp1);
        System.out.println("Employee age is "+semp1.getAge());
        System.out.println("The collect pay is Rs."+semp1.collectPay());
        semp1.retire();
        System.out.println("The pension pay is Rs."+semp1.collectPay());

        System.out.println("");
        System.out.println("-----------------------------------------------------------------------------------------------");
        System.out.println("");
        HourlyEmployee hemp1 = new HourlyEmployee("Charan", "12-05-1999","08-08-2022",25000d);
        System.out.println("Employee details:");
        System.out.println(hemp1);
        System.out.println("Employee age is "+hemp1.getAge());
        System.out.println("The collect pay is Rs."+hemp1.collectPay());
        System.out.println("The Double pay is Rs."+hemp1.getDoublePay());
    }
}
