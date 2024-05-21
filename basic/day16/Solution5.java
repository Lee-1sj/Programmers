package basic.day16;

public class Solution5 {
    public String solution(String my_string, String alp) {
        char[] ch_myString = my_string.toCharArray();
        StringBuilder sb = new StringBuilder();
        char cha = alp.charAt(0);

        for (char data : ch_myString) {
            if (data == cha) {
                sb.append(Character.toUpperCase(data));
            } else {
                sb.append(data);
            }
        }
        return sb.toString();
    }
}
