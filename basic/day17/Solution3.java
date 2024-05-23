package basic.day17;

import java.util.ArrayList;

public class Solution3 {
    public String[] solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        for (String data : strArr) {
            if (!data.contains("ad")) {
                strList.add(data);
            }
        }
        String[] answer = new String[strList.size()];
        for (int i = 0; i < strList.size(); i++) {
            answer[i] = strList.get(i);
        }
        return answer;
    }
}
