package basic.day10;

import java.util.ArrayList;

public class Solution2 {
    public int solution(String my_string, String is_prefix) {
        int answer = 0;
        ArrayList<String> list = new ArrayList<>();
        for (int i = my_string.length(); i >= 0; i--) {
            list.add(my_string.substring(0, i));
            if (list.contains(is_prefix)) {
                answer = 1;
            }
        }
        return answer;
    }
}
