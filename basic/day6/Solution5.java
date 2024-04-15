package basic.day6;

public class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int start = queries[i][0];
            int end = queries[i][1];
            int compare = queries[i][2];
            int min = Integer.MAX_VALUE;

            for (int j = start; j <= end; j++) {
                if (arr[j] > compare && arr[j] < min) {
                    min = arr[j];
                }
            }
            answer[i] = (min == Integer.MAX_VALUE) ? (-1) : (min);
        }
        return answer;
    }
}
