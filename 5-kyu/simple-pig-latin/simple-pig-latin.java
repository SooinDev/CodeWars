public class PigLatin {
    public static String pigIt(String str) {
        String[] list = str.split(" ");
        String answer = "";
​
        for (int i = 0; i < list.length; i++) {
            String word = list[i];
​
            // 첫 글자가 알파벳인지 확인
            if (Character.isLetter(word.charAt(0))) {
                String firstChar = word.substring(0, 1);
                String restOfWord = word.substring(1);
                answer += restOfWord + firstChar + "ay";
            } else {
                answer += word;
            }
​
            if (i < list.length - 1) {
                answer += " ";
            }
        }
​
        return answer;
    }
}