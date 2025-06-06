public class Order {
    public static String order(String words) {
        if (words == null || words.isEmpty()) {
            return "";
        }
​
        String[] wordArray = words.split(" ");
        String[] result = new String[wordArray.length];
​
        for (int i = 0; i < wordArray.length; i++) {
            for (int j = 0; j < wordArray[i].length(); j++) {
                char c = wordArray[i].charAt(j);
                if (c >= '1' && c <= '9') {
                    int position = c - '0';
                    result[position - 1] = wordArray[i];
                    break;
                }
            }
        }
​
        return String.join(" ", result);
    }
}