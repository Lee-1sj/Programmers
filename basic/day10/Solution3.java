package basic.day10;

public class Solution3 {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, s));
        for (int i = e; i >= s; i--) {
            sb.append(my_string.charAt(i));
        }
        sb.append(my_string.substring(e + 1));
        answer = sb.toString();
        return answer;
    }
}
