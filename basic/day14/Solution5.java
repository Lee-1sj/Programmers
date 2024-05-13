package basic.day14;

public class Solution5 {
    public int[] solution(int[] arr, int[][] queries) {
        int start = -1;
        int end = -1;
        for(int i=0; i<queries.length; i++){
            start = queries[i][0];
            end = queries[i][1];
            for(int j = start; j <= end; j++){
                arr[j]+=1;
            }
        }
        
        return arr;
    }
}
