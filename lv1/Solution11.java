package lv1;

//x만큼 간격 n개의 숫자
public class Solution11 {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        for (int i = 0; i < n; i++) {
            answer[i] = (long) (i + 1) * x;
        }
        return answer;
    }
}
