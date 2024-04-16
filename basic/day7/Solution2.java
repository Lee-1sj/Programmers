package basic.day7;

import java.util.ArrayList;

public class Solution2 {
    public int[] solution(int l, int r) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = l; i <= r; i++) {
            if (isContain(i)) {
                list.add(i);
            }
        }

        if (list.isEmpty()) {
            return new int[] { -1 };
        }

        int[] answer = new int[list.size()];
        for (int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j);
        }
        return answer;
    }

    public boolean isContain(int i) {
        String str = Integer.toString(i);
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != '5' && str.charAt(j) != '0') {
                return false;
            }
        }
        return true;
    }
}
