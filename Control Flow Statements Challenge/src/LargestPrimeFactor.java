public class LargestPrimeFactor {
    public static void main(String[] args) {
        LargestPrimeFactor.getLargestPrime(17);
        LargestPrimeFactor.getLargestPrime(217);
        LargestPrimeFactor.getLargestPrime(18);
        LargestPrimeFactor.getLargestPrime(1);
    }
    public static int getLargestPrime(int number) {
        if(number<=1) {
            System.out.println("Invalid Input");
            return -1;
        }else {
            int fact=0;
            for(int i=number;i>1;i--) {
                if(number%i==0) {
                    int flag=0;
                    int j=i/2;
                    for(int k=2;k<=j;k++) {
                        if(i%k==0) {
                            flag=1;
                            break;
                        }
                    }
                    if(flag==0) {
                        fact=i;
                        break;
                    }
                }
            }
            System.out.println("The largest prime factor of the number is :"+fact);
            return fact;
        }
    }
}
