public class HoursConvertion {
    public static String getDurationString(int minutes, int seconds) {
        if(minutes<0 || (seconds<0 || seconds>59)) {
            return "Invalid Input";
        }
        int hours=0;
        if(minutes>=60) {
            hours=minutes/60;
            minutes=minutes%60;
            return hours+"h"+minutes+"m"+seconds+"s";
        }else {
            return hours+"h"+minutes+"m"+seconds+"s";
        }
    }
    public static String getDurationString(int seconds) {
        if(seconds<0) {
            return "Invalid Input";
        }
        int minutes=0;
        if(seconds>=60) {
            minutes=seconds/60;
            int newseconds=seconds%60;
            System.out.println("The converted minutes and seconds of "+seconds+"seconds is :"+minutes+"m"+newseconds+"s");
            return getDurationString(minutes,newseconds);
        }else {
            return getDurationString(minutes,seconds);
        }
    }
}
