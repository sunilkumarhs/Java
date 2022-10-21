public class PrimeNumber {
    public static void main(String[] args) {
        int count=0;
        for(int i=2;i<=100;i++) {
            if(isPrime(i)) {
                System.out.println("The number "+i+" is prime number");
                count++;
            }
            if(count==6){
                System.out.println("Exiting from Loop");
                break;
            }
       }
    }
    public static boolean isPrime(int num) {
        if(num==1) {
            return false;
        }
        for(int i=2;i<=(long)Math.sqrt(num);i++) {
            System.out.println("Looping "+i);
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}
