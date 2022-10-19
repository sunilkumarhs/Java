public class HoursConvertion {
    private static final String Invalid_Value_Message="Invalid Input";
    public static String getDurationString(int minutes, int seconds) {
        if(minutes<0 || (seconds<0 || seconds>59)) {
            return Invalid_Value_Message;
        }
        int hours=0;
        if(minutes>=60) {
            hours=minutes/60;
            minutes=minutes%60;
                String strhours=hours+"h";
                String strminutes=minutes+"m";
                String strseconds=seconds+"s";
                if(hours<10) {
                    strhours="0"+strhours;
                }
                if(minutes<10) {
                    strminutes="0"+strminutes;
                }
                if(seconds<10) {
                    strseconds="0"+strseconds;
                }
            return strhours+":"+strminutes+":"+strseconds;
        }else {
            return hours+"h"+minutes+"m"+seconds+"s";
        }
    }
    public static String getDurationString(int seconds) {
        if(seconds<0) {
            return Invalid_Value_Message;
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
