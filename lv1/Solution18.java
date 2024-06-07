package lv1;

import java.util.ArrayList;
import java.util.Collections;
//나누어 떨어지는 숫자 배열
public class Solution18 {
    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int data : arr) {
            list.add(data);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % divisor != 0) {
                list.remove(i);
                i--;
            }
        }
        if (list.isEmpty()) {
            list.add(-1);
        }
        Collections.sort(list);
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
