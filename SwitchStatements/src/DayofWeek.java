public class DayofWeek {
    //jdk-version above 12
    public static void main(String[] args) {
        printDayOfTheWeek(1);
        printDayOfTheWeek(2);
        printDayOfTheWeek(3);
        printDayOfTheWeek(4);
        printDayOfTheWeek(5);
        printDayOfTheWeek(6);
        printDayOfTheWeek(7);

    }

    public static void printDayOfTheWeek(int day) {
        String week = switch (day) {
            case 1 -> {
                System.out.println("Hi i am sunil");
                yield "Sunday";}
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid value";
        };
        System.out.println(day + " stands for " + week);
    }
}
