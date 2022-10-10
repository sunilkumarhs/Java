public class HelloWorld {
    public static void main(String[] args){
        System.out.println("Hello World");
        System.out.println("i am Sunil Kumar HS");
        int myNumber=(18*17)-(7+1)+(12/2);
        int myFirstNumber=18;
        int mySecondNumber=17;
        int myThirdNumber=1;
        long sum=(myFirstNumber*mySecondNumber)+(myFirstNumber*myThirdNumber)-(mySecondNumber*myThirdNumber);
        System.out.println("the value of the myNumber is :"+myNumber);
        System.out.println("the value of the sum is :"+sum);
        long myTotalValue=myNumber+sum;
        System.out.println("the value of the MyTotalValue is :"+myTotalValue);
        int minValue=Integer.MIN_VALUE;
        int maxValue=Integer.MAX_VALUE;
        System.out.println("Integer maximum and minimum value is :"+minValue+" and "+maxValue);
        float minValuef=Float.MIN_VALUE;
        float maxvaluef=Float.MAX_VALUE;
        System.out.println("the maximum and minimum of the float datatype is :"+minValuef+"  and  "+maxvaluef);
        char min=Character.MIN_VALUE;
        char max=Character.MAX_VALUE;
        System.out.println("The maximum and minimum of the character type is :"+min+"  and  "+max);
        
    }
}