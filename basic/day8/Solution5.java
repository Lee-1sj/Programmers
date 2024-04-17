package basic.day8;

public class Solution5 {
    public String solution(String my_string, int[][] queries) {
        for (int[] data : queries) {
            int start = data[0];
            int end = data[1];
            String str = "";
            for (int i = end; i >= start; i--) {
                str += my_string.charAt(i);
            }
            my_string = my_string.substring(0, start) + str + my_string.substring(end + 1);
        }
        return my_string;
    }
}
