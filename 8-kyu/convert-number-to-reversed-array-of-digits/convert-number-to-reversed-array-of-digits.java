import java.util.Arrays;
​
public class Kata {
    public static int[] digitize(long n) {
        // Code here
        String str = String.valueOf(n);
        String reverse = new StringBuilder(str).reverse().toString();
        int[] digits = new int[reverse.length()];
        for (int i = 0; i < reverse.length(); i++) {
            digits[i] = Character.getNumericValue(reverse.charAt(i));
        }
​
        return digits;
    }
}