package basic.day13;

import java.util.ArrayList;

public class Solution4 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(num_list[i]);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}