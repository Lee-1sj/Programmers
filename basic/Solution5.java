package basic_test.day2;

public class Solution5 {
	
	 public String solution(String my_string, String overwrite_string, int s){
		 StringBuilder answer = new StringBuilder(my_string);
		 
		 for(int i=0; i<overwrite_string.length(); i++) {
			 if(s+i < my_string.length()) {
				 answer.setCharAt(s+i, overwrite_string.charAt(i));
			 }else {
				 answer.append(overwrite_string.charAt(i));
			 }
		 }
		 return answer.toString();
		 
	 }
}
