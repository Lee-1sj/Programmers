package basic.day13;

import java.util.ArrayList;

public class Solution3 {
    public String[] solution(String[] str_list) {
        int index = -1;
        String first = "";
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < str_list.length; i++) {
            if (str_list[i].equals("l") || str_list[i].equals("r")) {
                index = i;
                first = str_list[i];
                break;
            }
        }

        if (first.equals("")) {
            return new String[0];
        }

        if (first.equals("l")) {
            for (int i = 0; i < str_list.length; i++) {
                if (i < index) {
                    result.add(str_list[i]);
                }
            }
        }

        if (first.equals("r")) {
            for (int i = 0; i < str_list.length; i++) {
                if (i > index) {
                    result.add(str_list[i]);
                }
            }
        }

        String[] answer = result.toArray(new String[result.size()]);
        return answer;
    }
}
