package lv1;
//나머지가 1 되는 수 찾기
public class Solution12 {
    public int solution(int n) {
        int answer = 0;
        for (int x = 1; x <= n; x++) {
            if (n % x == 1) {
                answer = x;
                break;
            }
        }
        return answer;
    }
}
