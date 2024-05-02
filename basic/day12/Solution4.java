package basic.day12;

import java.util.Arrays;

public class Solution4 {
    public int[] solution(int[] arr) {
        int[] answer = {};
        int start = -1;
        int end = -1;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 2) {
                if (!flag) {
                    start = i;
                    flag = true;
                }
                end = i;
            }
        }

        if (!flag) {
            answer = new int[] { -1 };
        } else {
            answer = Arrays.copyOfRange(arr, start, end + 1);
        }
        return answer;
    }
}
