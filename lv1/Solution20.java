package lv1;

import java.util.ArrayList;

//제일 작은 수 제거하기
public class Solution20 {
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> list = new ArrayList<>();
        for (int data : arr) {
            list.add(data);
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }

        int a = list.indexOf(min);
        list.remove(a);
        if (list.isEmpty()) {
            list.add(-1);
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
