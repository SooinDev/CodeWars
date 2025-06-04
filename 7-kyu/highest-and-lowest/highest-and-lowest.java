import java.util.StringTokenizer;
​
public class Kata {
    public static String highAndLow(String numbers) {
        StringTokenizer st = new StringTokenizer(numbers, " ");
        int[] arr = new int[st.countTokens()];
​
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
​
        int max = arr[0];
        int min = arr[0];
​
        for (int i = 1; i < arr.length; i++) {
            max = Math.max(arr[i], max);
            min = Math.min(arr[i], min);
        }
​
        return max + " " + min;
    }
}