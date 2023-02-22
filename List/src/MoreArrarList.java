import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MoreArrarList {
    public static void main(String[] args) {
        String[] items = {"Bat", "Ball", "Wickets"};

        List<String> list = List.of(items);
        System.out.println(list);
//        list.add("Bails"); immutable collection
        System.out.println("Class Type of the List: "+list.getClass().getName());

        ArrayList<String> arrayList = new ArrayList<>(list);
        arrayList.add("Bails");
        System.out.println(arrayList);

        ArrayList<String> arrayList1 = new ArrayList<>(
                List.of("Helmet","Guard","ThyPad")
        );
        System.out.println(arrayList1);

        arrayList.addAll(arrayList1);
        System.out.println(arrayList);

        arrayList.add("Bat");
        System.out.println(arrayList);
        System.out.println("Index of Bat"+arrayList.indexOf("Bat"));
        System.out.println("last Index of the Bat"+arrayList.lastIndexOf("Bat"));
        arrayList.remove("Bat");
        System.out.println(arrayList);

        if(arrayList.contains("Helmet")) {
            System.out.println("ArrayList Contains Helmet");
        }else {
            System.out.println("ArrayList does not Contains Helmet");
        }

        arrayList.removeAll(List.of("Ball","Bat","Wickets"));
        System.out.println(arrayList);
        arrayList.retainAll(List.of("Bails","Stumps"));
        System.out.println(arrayList);
        arrayList.clear();
        System.out.println(arrayList);
        System.out.println("IsEmpty: "+arrayList.isEmpty());

        arrayList.addAll(List.of("Bat","Ball","Wickets","Bails"));
        System.out.println(arrayList);
        arrayList.addAll(Arrays.asList("Helmet","Guard","ThyPad"));
        System.out.println(arrayList);

        arrayList.sort(Comparator.reverseOrder());
        System.out.println(arrayList);
        arrayList.sort(Comparator.naturalOrder());
        System.out.println(arrayList);

        var cricketList = arrayList.toArray(new String[arrayList.size()]);
        System.out.println("Normal Array of Type String: "+Arrays.toString(cricketList));
    }
}
