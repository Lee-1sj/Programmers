package lv1;

public class Solution9 {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        for (int data : arr) {
            sum += data;
        }
        answer = sum / arr.length;
        return answer;
    }
}
