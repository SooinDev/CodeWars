import java.util.Arrays;
​
public class FindOdd {
    public static int findIt(int[] a) {
        Arrays.sort(a);
​
        for (int i = 0; i < a.length; i += 2) {
            if (i == a.length - 1 || a[i] != a[i + 1]) {
                return a[i];
            }
        }
​
        return -1;
    }
}