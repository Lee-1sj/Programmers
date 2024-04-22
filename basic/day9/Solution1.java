package basic.day9;

import java.util.ArrayList;

public class Solution1 {
    public ArrayList<Integer> solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> list = new ArrayList<>();
        for (String data : intStrs) {
            String answer = data.substring(s, s + l);
            int num = Integer.parseInt(answer);
            if (num > k) {
                list.add(num);
            }
        }
        return list;
    }
}
