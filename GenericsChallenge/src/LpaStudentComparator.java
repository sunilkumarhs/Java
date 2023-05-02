import java.util.Comparator;

public class LpaStudentComparator implements Comparator<LPAStudent> {

    @Override
    public int compare(LPAStudent o1, LPAStudent o2) {
        return (int) (o1.getPercentage() - o2.getPercentage());
    }
}
