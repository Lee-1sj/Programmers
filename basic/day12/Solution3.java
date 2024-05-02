package basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution3 {
    public int[] solution(int[] arr, int[][] intervals) {
        int a1 = intervals[0][0];
        int b1 = intervals[0][1];
        int a2 = intervals[1][0];
        int b2 = intervals[1][1];
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();

        for (int data : arr) {
            list.add(data);
        }
        result.addAll(list.subList(a1, b1 + 1));
        result.addAll(list.subList(a2, b2 + 1));
        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
