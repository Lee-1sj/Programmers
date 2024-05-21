package basic.day16;

public class Solution4 {
    public String solution(String myString) {
        StringBuilder sb = new StringBuilder();
        char[] ch = myString.toCharArray();

        for (char data : ch) {
            if (data == 'a') {
                sb.append(Character.toUpperCase(data));
            } else if (data != 'A' && Character.isUpperCase(data)) {
                sb.append(Character.toLowerCase(data));
            } else {
                sb.append(data);
            }
        }

        return sb.toString();
    }
}
