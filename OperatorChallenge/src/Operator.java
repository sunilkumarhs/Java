public class Operator {
    public static void main(String[] args) {
        double d1=20.00d;
        double d2=80.00d;
        double d3=(d1+d2)*100.00d;
        System.out.println("The value of d3 is: "+d3);
        double d4=d3%40.00d;
        System.out.println("The remainder from the result of d3 and 40.00 is: "+d4);
        boolean b1 = (d4 == 0.00) ? true : false;
        System.out.println("The value of the b1 is: "+b1);
        if(!b1) {
            System.out.println("Got some remainder");
        }
    }
}
