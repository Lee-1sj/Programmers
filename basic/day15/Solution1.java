package basic.day15;

import java.util.ArrayList;

public class Solution1 {
    public int[] solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                list.add(arr[i] / 2);
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                list.add(arr[i] * 2);
            } else {
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
