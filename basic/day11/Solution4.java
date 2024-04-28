package basic.day11;

import java.util.ArrayList;

public class Solution4 {
    public int[] solution(int start, int end) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = start; i >= end; i--) {
            list.add(i);
        }
        int[] answer = new int[start - end + 1];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
