public class Casting {
    public static void main(String[] args) {
        byte b1=17;
        short s1=18;
        int i1=1718;
        long l1=5000+10*(b1+i1+s1);
        System.out.println("The value of the long after casting the integer,byte,short into long is :"+l1);
        int i2=(int)l1*b1+s1;
        System.out.println("the value of the integer i2 after the casting is:"+i2);
        System.out.println("the above long casting is automatic casting that is done by the jvm itself");
        System.out.println("the int casting is done by user so, it is called expicit type casting");
        float f1=16.23f;
        int i3=(int)f1*2;
        System.out.println("the value of i3 is:"+i3);
        double d1=i1/f1;
        System.out.println("The value of the d1 is :"+d1);
        long l2=(long)f1+(i3-b1);
        System.out.println("The value of l2 is :"+l2);
        byte b2=(byte)i2;//it prints modulus of 64 value of the assigned value if it is greater than its length limit
        System.out.println("the value of the b2 is :"+b2);
        //boolean b01=(boolean)i3;
        char c1=(char)i3;
        System.out.println("the value of the c1 is:"+c1);
        //here char and boolean can't be caste into any numeric types
        char unicode='\u0040';//this is using the unicode character table values
        System.out.println("The value of the unicode is :"+unicode);
    }
}
