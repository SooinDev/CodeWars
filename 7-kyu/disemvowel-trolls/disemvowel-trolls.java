import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
​
public class Troll {
    public static String disemvowel(String str) {
        // Code away...
        String[] arr = str.split("");
        List<String> list = new ArrayList<String>(Arrays.asList(arr));
​
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i].equals("a") || arr[i].equals("A") ||
                arr[i].equals("e") || arr[i].equals("E") ||
                arr[i].equals("i") || arr[i].equals("I") ||
                arr[i].equals("o") || arr[i].equals("O") ||
                arr[i].equals("u") || arr[i].equals("U"))
                list.remove(i);
        }
​
        String answer = String.join("", list);
​
        return answer;
    }
}