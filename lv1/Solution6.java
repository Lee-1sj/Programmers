package lv1;

import java.util.ArrayList;
import java.util.Collections;

public class Solution6 {
    public long solution(long n) {
        String[] s = String.valueOf(n).split("");
        ArrayList<String> list = new ArrayList<>();
        for (String data : s) {
            list.add(data);
        }
        Collections.sort(list);
        Collections.reverse(list);
        String temp = "";
        for (int i = 0; i < list.size(); i++) {
            temp += list.get(i);
        }
        return Long.parseLong(temp);
    }
}
