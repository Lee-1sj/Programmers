package basic.day17;

public class Solution1 {
    public String solution(String myString, String pat) {
        String answer = "";
        for (int i = 0; i < myString.length(); i++) {
            String temp = myString.substring(i);
            if (temp.startsWith(pat)) {
                answer = myString.substring(0, i + pat.length());
            }
        }
        return answer;
    }
}
