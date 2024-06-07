package lv1;

//가운데 글자 가져오기
public class Solution21 {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split("");
        if (s.length() % 2 == 1) {
            for (int i = 0; i < arr.length; i++) {
                answer = arr[(s.length() - 1) / 2];
            }
        } else if (s.length() % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                answer = arr[(s.length() - 1) / 2] + arr[(s.length() - 1) / 2 + 1];
            }
        }
        return answer;
    }
}
