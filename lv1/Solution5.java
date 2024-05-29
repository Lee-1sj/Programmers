package lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution5 {
    public int[] solution(long n) {
        ArrayList<String> list = new ArrayList<>();
        String[] nn = String.valueOf(n).split("");
        for (String data : nn) {
            list.add(data);
        }
        Collections.reverse(list);
        ArrayList<Integer> intList = new ArrayList<>();
        for (String data : list) {
            intList.add(Integer.parseInt(data));
        }
        int[] answer = new int[intList.size()];
        for (int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}
