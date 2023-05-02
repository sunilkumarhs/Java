import java.util.ArrayList;
import java.util.List;

public class QueryList<T extends Student & QueryItem> extends ArrayList<T> {

    public QueryList() {

    }
    public QueryList(List<T> items) {
        super(items);
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
    public QueryList<T> getMatches(String fieldName, String value) {
        QueryList<T> matches = new QueryList<>();
        for(var item : this) {
            if (item.checkItem(fieldName, value)) {
                matches.add(item);
            }
        }
        return matches;
    }
}
