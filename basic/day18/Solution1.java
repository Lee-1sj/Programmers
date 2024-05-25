package basic.day18;

import java.util.ArrayList;

public class Solution1 {
    public int[] solution(String myString) {
        String[] temp = myString.split("x", -1);
        ArrayList<Integer> result = new ArrayList<>();
        int count = -1;

        for (int i = 0; i < temp.length; i++) {
            count = temp[i].length();
            result.add(count);
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
