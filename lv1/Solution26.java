package lv1;

//부족한 금액 계산하기
public class Solution26 {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        for (int i = 1; i <= count; i++) {
            sum += price * i;
        }
        if (money < sum) {
            answer = sum - money;
        }
        return answer;
    }
}
