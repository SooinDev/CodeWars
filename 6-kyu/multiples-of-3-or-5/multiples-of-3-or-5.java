import java.util.ArrayList;
​
public class Solution {
    public int solution(int number) {
        //TODO: Code stuff here
        ArrayList<Integer> list = new ArrayList<Integer>();
        int answer = 0;
​
        for (int i = 1; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                list.add(i);
            }
        }
​
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i);
        }
​
        return answer;
    }
}