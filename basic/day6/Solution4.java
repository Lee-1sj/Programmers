package basic.day6;

public class Solution4 {
    public int[] solution(int[] arr, int[][] queries) {
        for (int i = 0; i < queries.length; i++) {
            int num1 = arr[queries[i][0]];
            int num2 = arr[queries[i][1]];
            arr[queries[i][0]] = num2;
            arr[queries[i][1]] = num1;
        }
        return arr;
    }
}
