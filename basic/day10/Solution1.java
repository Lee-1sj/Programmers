package basic.day10;

public class Solution1 {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string.substring(0, n));

        return sb.toString();
    }
}
