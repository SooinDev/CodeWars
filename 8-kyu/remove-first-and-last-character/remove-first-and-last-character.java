public class RemoveChars {
    public static String remove(String str) {
        // your code here
​
        String answer = str.substring(1, str.length() - 1);
        System.out.println(answer);
        
        return answer;
    }
}