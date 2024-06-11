import java.util.ArrayList;
import java.util.Collections;
class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        ArrayList<Integer> list = new ArrayList<>();
        for(String data : arr){
            list.add(Integer.parseInt(data));
        }
        int min = Collections.min(list);
        int max = Collections.max(list);
        
        return min + " " + max;
    }
}