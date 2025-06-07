public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty())
            return null;
​
        String[] words = phrase.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (!words[i].isEmpty())
                words[i] = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
        }
​
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}