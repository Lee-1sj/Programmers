package basic.day5;

public class Solution4 {
	public int solution(int[] num_list) {
		int answer = 0;
		int num1 = 1;
		int num2 = 0;
		for (int i = 0; i < num_list.length; i++) {
			num1 *= num_list[i];
			num2 += num_list[i];
		}
		if (num1 < (int) Math.pow(num2, 2)) {
			answer = 1;
		} else {
			answer = 0;
		}
		return answer;
	}
}
