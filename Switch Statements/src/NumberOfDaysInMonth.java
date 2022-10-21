public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        NumberOfDaysInMonth.getDaysInMonth(4,2000);
        NumberOfDaysInMonth.getDaysInMonth(2,2022);
        NumberOfDaysInMonth.getDaysInMonth(2,2020);
        NumberOfDaysInMonth.getDaysInMonth(1,2030);
    }
    public static boolean isLeapYear(int year) {
        if(year >=1 && year <=9999) {
            if(year %400 == 0) {
                return true;
            }else if(year %100 == 0) {
                return false;
            }else if(year %4 == 0) {
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        int days=0;
        if((month<1||month>12)||(year<1||year>9999)) {
            return -1;
        }
        switch(month) {
            case 1:
                days=31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    days=29;
                    break;
                }
                days=28;
                break;
            case 3:
                days=31;
                break;
            case 4:
                days=30;
                break;
            case 5:
                days=31;
                break;
            case 6:
                days=30;
                break;
            case 7:
                days=31;
                break;
            case 8:
                days=31;
                break;
            case 9:
                days=30;
                break;
            case 10:
                days=31;
                break;
            case 11:
                days=30;
                break;
            case 12:
                days=31;
                break;
        }
        System.out.println("The number of days in month "+month+" is : "+days);
        return days;
    }
}
