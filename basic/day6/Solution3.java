package basic.day6;

public class Solution3 {
    public String solution(int[] numLog) {
        int num = 0;
        StringBuilder answer = new StringBuilder();
        for (int i = 1; i < numLog.length; i++) {
            num = numLog[i] - numLog[i - 1];
            if (num == 1) {
                answer.append("w");
            } else if (num == -1) {
                answer.append("s");
            } else if (num == 10) {
                answer.append("d");
            } else if (num == -10) {
                answer.append("a");
            }
        }
        return answer.toString();
    }
}
