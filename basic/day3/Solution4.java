package basic.day3;

public class Solution4 {
	public int solution(int a, int b) {
		String result1 = "" + a + b;
		String result2 = "" + b + a;
		
		if(Integer.parseInt(result1) > Integer.parseInt(result2)) {
			return Integer.parseInt(result1);
		}else {
			return Integer.parseInt(result2);
		}
	}
}
