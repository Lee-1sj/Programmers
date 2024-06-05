package lv1;

//없는 숫자 더하기
public class Solution16 {
    public int solution(int[] numbers) {
        int total = 45;
        int answer = 0;
        int temp = 0;
        for (int i = 0; i < numbers.length; i++) {
            temp += numbers[i];
        }
        answer = total - temp;
        return answer;
    }
}
