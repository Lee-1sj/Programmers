import java.util.Arrays;
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int light = 0;
        int heavy = people.length - 1;
        Arrays.sort(people);
        // 50 50 70 80
        while(light <= heavy){
            if(people[light] + people[heavy] <= limit){
                heavy--;
                light++;
            } else {
                heavy--;
            }
            answer++;
        }
        return answer;
    }
}