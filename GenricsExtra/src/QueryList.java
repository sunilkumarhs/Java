import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> {
    private List<T> items;

    public QueryList(List<T> items) {
        this.items = items;
    }

    public static <S extends QueryItem> List<S> getMatches(List<S> items, String fieldName, String value) {
        List<S> matches = new ArrayList<>();
        for(var item : items) {
            if (item.checkItem(fieldName, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
    public List<T> getMatches(String fieldName, String value) {
        List<T> matches = new ArrayList<>();
        for(var item : items) {
            if (item.checkItem(fieldName, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
