import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Boxing_Unboxing {
    public static void main(String[] args) {
        Integer[] boxing = new Integer[10];
        for(int i=0;i<10;i++) {
            boxing[i] =i+2;
        }
        System.out.println(Arrays.toString(boxing));
        System.out.println(boxing.getClass().getName());
        System.out.println();
        ArrayList<Integer> elements = new ArrayList<>(10);
        for(int i=0;i<10;i++) {
            elements.add(i+3);
        }
        System.out.println(elements);
        String name = "Sunil";
        String ct = name+"Trsanlist";
        System.out.println(ct);
    }
}
