package lv1;
//핸드폰 번호 가리기
public class Solution19 {
    public String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        StringBuilder _sb = new StringBuilder();
        _sb.append(phone_number);
        for (int i = 0; i < phone_number.length() - 4; i++) {
            sb.append("*");
        }
        sb.append(_sb.substring(phone_number.length() - 4));

        return sb.toString();
    }
}
