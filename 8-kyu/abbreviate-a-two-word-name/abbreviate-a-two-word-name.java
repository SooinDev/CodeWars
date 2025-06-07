public class AbbreviateTwoWords {
    public static String abbrevName(String name) {
        String[] words = name.split(" ");
        String tmp = "";
        for (int i = 0; i < words.length; i++)
            tmp += words[i].substring(0, 1) + ".";
        return tmp.substring(0, tmp.length() - 1).toUpperCase();
    }
}