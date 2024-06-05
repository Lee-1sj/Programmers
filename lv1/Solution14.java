package lv1;

//서울에서 김서방 찾기
public class Solution14 {
    public String solution(String[] seoul) {
        int index = -1;
        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                index = i;
            }
        }
        return "김서방은 " + index + "에 있다";
    }
}
