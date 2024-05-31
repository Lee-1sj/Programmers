package lv1;

public class Solution7 {
    public long solution(long n) {
        long answer = 0;
        double x = Math.sqrt(n);
        if (x == (int) x && x > 0) {
            answer = (long) ((x + 1) * (x + 1));
        } else {
            answer = -1;
        }

        return answer;
    }
}
