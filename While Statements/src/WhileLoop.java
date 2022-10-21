public class WhileLoop {
    public static void main(String[] args) {
        WhileLoop.sumOfEven(1718,1817);
    }
    public static boolean isEvenNumber(int num) {
        while(num%2==0) {
            return true;
        }
        return false;
    }
    public static void sumOfEven(int startNumber,int endNumber) {
        int count=0;
        while(startNumber<=endNumber) {
            startNumber++;
            if(!isEvenNumber(startNumber)) {
                continue;
            }
            System.out.println("The Even Number : "+startNumber);
            count++;
            if(count>=5) {
                System.out.println("Exiting from While Loop");
                break;
            }
        }
        System.out.println("The total number of even numbers found is :"+count);
    }
}
