package basic.day11;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
    public ArrayList<Integer> solution(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % k == 0) {
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}
