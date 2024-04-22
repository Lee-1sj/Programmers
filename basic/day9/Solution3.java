package basic.day9;

public class Solution3 {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder();
        answer.append(my_string.substring(my_string.length() - n, my_string.length()));

        return answer.toString();
    }
}
