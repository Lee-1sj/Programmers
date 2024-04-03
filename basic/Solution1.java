package basic_test.day3;

public class Solution1 {
	public static String solution(String str1, String str2) {
/*		char[] str1Array = str1.toCharArray();
		char[] str2Array = str2.toCharArray();
		String answer = "";
		char[] answerArray = new char[str1Array.length + str2Array.length];

		for(int i=0; i<str1Array.length + str2Array.length; i++) {
			if(i%2==0) {	
				answerArray[i] = str1Array[i/2];
			}else			
				answerArray[i] = str2Array[(i-1)/2];
		}
		answer = String.valueOf(answerArray);
		return answer.toString(); */

		String answer = "";
		for(int i=0; i<str1.length(); i++) {
			answer += str1.charAt(i);
			answer += str2.charAt(i);
		}
		return answer;
	}
}

