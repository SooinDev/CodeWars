import java.util.stream.Stream;
​
public class SquareDigit {
    public int squareDigits(int n) {
        int[] digits = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        StringBuilder sb = new StringBuilder();
​
        for (int i = 0; i < digits.length; i++) {
            digits[i] = (int)(Math.pow(digits[i], 2));
        }
​
        for (int i : digits)
            sb.append(i);
​
        int answer = Integer.parseInt(sb.toString());
​
        return answer; // TODO Implement me
    }
}