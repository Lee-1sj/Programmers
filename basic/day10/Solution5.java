package basic.day10;

public class Solution5 {
    public String solution(int q, int r, String code) {
        String answer = "";
        for (int index = 0; index < code.length(); index++) {
            if (index % q == r) {
                answer += code.charAt(index);
            }
        }
        return answer;
    }
}
