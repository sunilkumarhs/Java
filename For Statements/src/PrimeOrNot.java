public class PrimeOrNot {
    public static void main(String[] args) {
        System.out.println("0 is "+(isPrime(0) ? "" : "NOT ")+"Prime Number");
        System.out.println("1 is "+(isPrime(1) ? "" : "NOT ")+"Prime Number");
        System.out.println("2 is "+(isPrime(2) ? "" : "NOT ")+"Prime Number");
        System.out.println("3 is "+(isPrime(3) ? "" : "NOT ")+"Prime Number");
        System.out.println("4 is "+(isPrime(4) ? "" : "NOT ")+"Prime Number");
        System.out.println("5 is "+(isPrime(5) ? "" : "NOT ")+"Prime Number");
        System.out.println("220 is "+(isPrime(220) ? "" : "NOT ")+"Prime Number");

    }

    public static boolean isPrime(int num) {
        if(num <=2) {
            return (num ==2);
        }
        for(int i=2;i<=num/2;i+=1) {
            if(num%i==0) {
                return false;
            }
        }
        return  true;
    }
}
