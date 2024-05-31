package lv1;
//자릿수 더하기
public class Solution4 {
    public int solution(int n) {
        int answer = 0;
        String nn = String.valueOf(n);
        for (char data : nn.toCharArray()) {
            answer += (data - 48);
        }
        return answer;
    }
}
