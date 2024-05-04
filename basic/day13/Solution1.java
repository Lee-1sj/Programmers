package basic.day13;

import java.util.Arrays;

public class Solution1 {
    public int[] solution(int[] num_list, int n) {
        int[] answer = {};
        answer = Arrays.copyOfRange(num_list, n - 1, num_list.length);
        return answer;
    }
}