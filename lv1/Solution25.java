package lv1;

import java.util.Arrays;

//문자열 내림차순으로 배치하기
public class Solution25 {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split("");
        Arrays.sort(arr);
        for (String data : arr) {
            sb.append(data);
        }
        sb.reverse();
        return sb.toString();
    }
}
