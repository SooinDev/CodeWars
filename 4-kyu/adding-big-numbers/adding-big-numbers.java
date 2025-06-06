public class Kata {
    public static String add(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
​
        while (i >= 0 || j >= 0 || carry > 0) {
            int sum = carry;
​
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
​
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
​
            result.append(sum % 10);
            carry = sum / 10;
        }
​
        String answer = result.reverse().toString();
​
        int start = 0;
        while (start < answer.length() - 1 && answer.charAt(start) == '0') {
            start++;
        }
​
        return answer.substring(start);
    }
}