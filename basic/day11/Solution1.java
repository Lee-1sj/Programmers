package basic.day11;

public class Solution1 {
    public int[] solution(String my_string) {
        int[] answer = new int[52];

        for (char data : my_string.toCharArray()) {
            if (data >= 'A' && data <= 'Z') { // 65-90 인덱스 0-25
                answer[data - 'A']++;
            } else if (data >= 'a' && data <= 'z') { // 97-122 인덱스 26-51
                answer[data - 'G']++;
            }
        }
        return answer;
    }
}
