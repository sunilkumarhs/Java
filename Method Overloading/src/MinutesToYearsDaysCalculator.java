public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        MinutesToYearsDaysCalculator.printYearsAndDays(525600);
        MinutesToYearsDaysCalculator.printYearsAndDays(561600);
    }
    public static void printYearsAndDays(long minutes) {
        if(minutes<0) {
            System.out.println("Invalid Value");
            return;
        }
        long days=0;
        long years=0;
        if(minutes>59) {
            long hours=minutes/60;
            if(hours>23) {
                days=hours/24;
            }
            if(days>364) {
                years=days/365;
                days=days%365;
            }
        }
        System.out.println(minutes+" min = "+years+" y and "+days+" d");
    }
}
