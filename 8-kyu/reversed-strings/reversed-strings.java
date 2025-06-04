public class Kata {
    public static String solution(String str) {
        String answer = "";
        StringBuffer sb = new StringBuffer(str);
​
        answer = sb.reverse().toString();
​
        return answer;
    }
}