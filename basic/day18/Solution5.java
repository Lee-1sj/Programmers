package basic.day18;

public class Solution5 {
    public String solution(String rny_string) {
        StringBuilder sb = new StringBuilder();
        char[] ch = rny_string.toCharArray();
        for (char data : ch) {
            if (data == 'm') {
                sb.append("rn");
            } else {
                sb.append(data);
            }
        }
        return sb.toString();
    }
}
