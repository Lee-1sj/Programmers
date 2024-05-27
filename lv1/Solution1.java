package lv1;

public class Solution1 {
    // 문자열 내 p와 y의 개수
    boolean solution(String s) {
        boolean answer = true;
        int countP = 0;
        int countY = 0;
        String[] str = s.split("");

        for (String data : str) {
            if (data.equalsIgnoreCase("p")) {
                countP++;
            }
            if (data.equalsIgnoreCase("y")) {
                countY++;
            }
            answer = (countP == countY) ? (true) : (false);
        }

        return answer;
    }
}