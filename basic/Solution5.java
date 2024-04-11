package basic_test_day5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Solution5 {
	public int solution(int[] num_list) {
		int answer = 0;
		String str1 = null;
		String str2 = null;
		List<Integer> numList = new ArrayList<>();
		for (int data : num_list) {
			numList.add(data);
		}
		str1 = numList.stream().filter(n -> n % 2 == 0)
				.map(Object::toString).collect(Collectors.joining());
		str2 = numList.stream().filter(n -> n % 2 != 0)
				.map(Object::toString).collect(Collectors.joining());
		answer = Integer.parseInt(str1) + Integer.parseInt(str2);

		return answer;
	}
}
