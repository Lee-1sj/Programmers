package basic.day7;

import java.util.ArrayList;
import java.util.List;

public class Solution5 {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(list.isEmpty()){
                list.add(arr[i]);
            }else if(list.get(list.size()-1)<arr[i]){
                list.add(arr[i]);
            }else{
                list.remove(list.get(list.size()-1));
                i--;
            }
        }
        
        int[] stk = new int[list.size()];
        for(int j=0; j<list.size(); j++){
            stk[j] = list.get(j);
        }
        return stk;
    }
}
