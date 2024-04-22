package basic.day9;

public class Solution5 {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        String[] strArray = new String[my_string.length()];
        for(int i=0; i<my_string.length(); i++){
            strArray[i] = my_string.substring(i);
            if(strArray[i].equals(is_suffix)){
                answer = 1;
                break;
            }else{
                answer = 0;
            }
        }
        return answer;
    }
}
