package basic.day14;

import java.util.ArrayList;

public class Solution3 {
    public String[] solution(String[] todo_list, boolean[] finished) {
        int index = -1;
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                index = i;
                list.add(todo_list[index]);
            }
        }
        String[] answer = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
