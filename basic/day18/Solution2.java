package basic.day18;

import java.util.ArrayList;
import java.util.Collections;

public class Solution2 {
    public ArrayList<String> solution(String myString) {
        String[] temp = myString.split("x");
        ArrayList<String> list = new ArrayList<>();

        for (String data : temp) {
            if (!data.equals("")) {
                list.add(data);
            }
        }
        Collections.sort(list);
        return list;
    }
}
