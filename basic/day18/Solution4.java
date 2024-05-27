package basic.day18;

public class Solution4 {
    public int solution(String myString, String pat) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        char[] ch = myString.toCharArray();
        for (char data : ch) {
            if (data == 'A') {
                sb.append('B');
            } else if (data == 'B') {
                sb.append('A');
            } else {
                sb.append(data);
            }
        }
        if (sb.toString().contains(pat)) {
            answer = 1;
        }

        return answer;
    }
}
