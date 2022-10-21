public class SumOfDiviser {
    public static void main(String[] args) {
        int sum=0;
        int count=0;
        System.out.println("Entering to for loop");
        for(int i=1;i<=1000;i++) {
            if((i%3==0)&&(i%5==0)) {
                System.out.println("Found number :"+i);
                count++;
                sum+=i;
            }
            if(count==10) {
                System.out.println("Exiting from loop");
                break;
            }
        }
        System.out.println("The sum of the number that are divisible by 3 and 5 from 1 to 1000 is : "+sum);
    }
}
