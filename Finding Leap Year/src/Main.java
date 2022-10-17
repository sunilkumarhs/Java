public class Main {
    public static void main(String[] args) {
        boolean leap=LeapYear.isLeapYear(2004);
        if(leap) {
            System.out.println("The Given Year is Leap Year");
        }else {
            System.out.println("The Given Year is not a Leap Year");
        }
    }
}
