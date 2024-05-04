package basic.day13;

import java.util.ArrayList;

public class Solution2 {
    public int[] solution(int[] num_list, int n) {
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int data : num_list) {
            numList.add(data);
        }
        result.addAll(numList.subList(n, numList.size()));
        result.addAll(numList.subList(0, n));

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
