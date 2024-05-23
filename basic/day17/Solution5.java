package basic.day17;

import java.util.ArrayList;

public class Solution5 {
    public String[] solution(String my_string) {
        String[] answer = my_string.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for (String data : answer) {
            if (!data.equals("")) {
                list.add(data);
            }
        }
        String[] result = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
