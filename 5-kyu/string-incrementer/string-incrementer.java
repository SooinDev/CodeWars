import java.math.BigInteger;
​
public class Kata {
    public static String incrementString(String str) {
        if (str.isEmpty()) return "1";
​
        int i = str.length() - 1;
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }
​
        if (i == str.length() - 1) {
            return str + "1";
        }
​
        String prefix = str.substring(0, i + 1);
        String numberPart = str.substring(i + 1);
​
        int originalLength = numberPart.length();
​
        BigInteger number = new BigInteger(numberPart).add(BigInteger.ONE);
​
        String newNumberPart = String.format("%0" + originalLength + "d", number);
​
        return prefix + newNumberPart;
    }
}
​