package basic.day11;

import java.util.Arrays;

public class Solution3 {
    public String solution(String my_string, int[] indices) {
        StringBuilder sb = new StringBuilder();
        sb.append(my_string);
        // for (int data : indices) {
        // sb.deleteCharAt(data);
        // }
        // return sb.toString();
        Arrays.sort(indices);
        for (int i = indices.length - 1; i >= 0; i--) {
            sb.deleteCharAt(indices[i]);
        }
        return sb.toString();
    }
}
