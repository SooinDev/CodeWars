import java.util.ArrayList;
import java.util.List;
​
public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        ArrayList<Object> filteredList = new ArrayList<>();
​
        for (Object item : list) {
            if (item instanceof Integer) {
                filteredList.add(item);
            }
        }
        System.out.println(filteredList);
​
        return filteredList;
    }
}