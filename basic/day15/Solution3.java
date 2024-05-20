package basic.day15;

import java.util.Arrays;

public class Solution3 {
    public int solution(int[] num_list) {
        int answer = 0;
        int[] copy = Arrays.copyOf(num_list, num_list.length);

        answer = function(copy);
        return answer;
    }

    public int function(int[] copy) {
        int count = 0;

        for (int i = 0; i < copy.length; i++) {
            while (copy[i] > 1) {
                if (copy[i] % 2 == 0) {
                    copy[i] = copy[i] / 2;
                } else if (copy[i] % 2 == 1) {
                    copy[i] = (copy[i] - 1) / 2;
                }
                count++;
            }
        }
        return count;
    }
}
