public class SpinWords {
    public String spinWords(String sentence) {
        //TODO: Code stuff here
        String[] words = sentence.split(" ");
        String[] reverse = new String[words.length];
        String answer = "";
​
        for (int i = 0; i < words.length; i++) {
            int num = words[i].length();
​
            if (num >= 5) {
                StringBuffer sb = new StringBuffer(words[i]);
                String tmp = sb.reverse().toString();
                reverse[i] = tmp;
            }
            else
                reverse[i] = words[i];
        }
​
        for (int i = 0; i < reverse.length; i++) {
            answer += reverse[i] + " ";
        }
​
        answer = answer.substring(0, answer.length() - 1);
        System.out.println(answer);
​
        return answer;
    }
}