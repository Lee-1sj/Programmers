package lv1;

//콜라츠 추측
public class Solution17 {
    public int solution(int num) {
        int answer = 0;
        if (num != 1) {
            answer = collatz(num);
        }
        return answer;
    }

    public int collatz(int num) {
        int count = 0;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else if (num % 2 == 1) {
                num = num * 3 + 1;
            }
            count++;
            if (count >= 500) {
                return -1;
            }
        }
        return count;
    }
}
