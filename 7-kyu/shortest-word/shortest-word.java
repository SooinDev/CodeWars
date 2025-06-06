public class Kata {
    public static int findShort(String s) {
        String[] words = s.split(" ");
        int minLength = Integer.MAX_VALUE;
​
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() < minLength) {
                minLength = words[i].length();
            }
        }
​
        return minLength;
    }
}