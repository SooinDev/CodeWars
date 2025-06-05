public class Kata {
    public static String rot13(String str) {
        char[] chars = str.toCharArray();
        String answer = "";
​
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
​
            if (c >= 'a' && c <= 'z') {
                // 소문자 처리
                c = (char) ((c - 'a' + 13) % 26 + 'a');
            } else if (c >= 'A' && c <= 'Z') {
                // 대문자 처리
                c = (char) ((c - 'A' + 13) % 26 + 'A');
            }
            // 숫자나 특수문자는 그대로 유지
​
            answer += c;
        }
​
        return answer;
    }
}