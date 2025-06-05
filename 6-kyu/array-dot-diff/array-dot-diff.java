import java.util.ArrayList;
import java.util.Arrays;
​
public class Kata {
    public static int[] arrayDiff(int[] a, int[] b) {
        ArrayList<Integer> result = new ArrayList<>();
​
        for (int valueA : a) {
            boolean found = false;
​
            for (int valueB : b) {
                if (valueA == valueB) {
                    found = true;
                    break;
                }
            }
​
            if (!found) {
                result.add(valueA);
            }
        }
​
        return result.stream().mapToInt(i -> i).toArray();
    }
}