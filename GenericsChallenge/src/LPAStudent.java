import java.util.Random;

public class LPAStudent extends Student{
    private  double percentage;

    private static Random random = new Random();

    public LPAStudent() {
        percentage = random.nextDouble(0,100.001);
    }

    @Override
    public String toString() {
        return "%s   %3.2f%%".formatted(super.toString(),percentage);
    }

    public  double getPercentage() {
        return percentage;
    }

    public boolean checkItem(String fieldName, String value) {
        if(fieldName.equalsIgnoreCase("percentage")) {
            return percentage <= Integer.parseInt(value);
        }
        return super.checkItem(fieldName,value);
    }
}
