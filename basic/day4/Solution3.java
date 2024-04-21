package basic.day4;

public class Solution3 {
	public int solution(int n) {
		if (n % 2 == 0) {
			int answer = 0;
			for (int i = 2; i <= n; i += 2) {
				answer += i * i;
			}
			return answer;
		} else {
			int answer = 0;
			for (int i = 1; i <= n; i += 2) {
				answer += i;
			}
			return answer;
		}
	}
}
