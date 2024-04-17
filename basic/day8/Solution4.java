package basic.day8;

public class Solution4 {
    public int solution(String number) {
        int sum = 0;
        int num = 0;
        for (int i = 0; i < number.length(); i++) {
            num = Character.getNumericValue(number.charAt(i));
            sum += num;
        }
        return sum % 9;
    }
}
