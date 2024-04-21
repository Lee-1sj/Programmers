package basic.day4;

public class Solution4 {
	public int solution(String ineq, String eq, int n, int m) {
		int answer = 0;
		if (ineq.equals(">") && eq.equals("=")) {
			return answer = (n >= m) ? (1) : (0);
		}
		if (ineq.equals(">") && eq.equals("!")) {
			return answer = (n > m) ? (1) : (0);
		}
		if (ineq.equals("<") && eq.equals("=")) {
			return answer = (n <= m) ? (1) : (0);
		}
		if (ineq.equals("<") && eq.equals("!")) {
			return answer = (n < m) ? (1) : (0);
		}
		return answer;
	}
}
