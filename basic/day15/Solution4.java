package basic.day15;

public class Solution4 {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int data : num_list) {
                answer += data;
            }
        } else {
            answer = 1;
            for (int data : num_list) {
                answer *= data;
            }
        }
        return answer;
    }
}
