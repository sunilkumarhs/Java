import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Buildings("Town Hall",UsageType.GOVERNMENT));
        mappables.add(new Buildings("KalaKeshatra",UsageType.ENTERTAINMENT));
        mappables.add(new Buildings("SNM Stadium",UsageType.SPORTS));

        mappables.add(new UtilityLine("College",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("House",UtilityType.WATER));
        
        for(var m : mappables){
            Mappable.mapIt(m);
        }
    }
}
