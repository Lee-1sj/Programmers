package basic.day18;

public class Solution3 {
    public int solution(String binomial) {
        int answer = 0;
        String[] temp = binomial.split(" ");
        int a = Integer.parseInt(temp[0]);
        int b = Integer.parseInt(temp[2]);
        String ab = temp[1];
        switch (ab) {
            case "+":
                answer = a + b;
                break;
            case "-":
                answer = a - b;
                break;
            case "*":
                answer = a * b;
                break;
            default:
                break;
        }
        return answer;
    }
}
