import java.util.ArrayList;
import java.util.Collections;
class Solution{
    public int solution(int []A, int []B){
        int answer = 0;
        ArrayList<Integer> listA = new ArrayList<>();
        ArrayList<Integer> listB = new ArrayList<>();
        for (int data : A) {
            listA.add(data);
        }
        for (int data : B) {
            listB.add(data);
        }
        Collections.sort(listA);
        Collections.sort(listB);
        Collections.reverse(listB);

        
        for (int i = 0; i < listA.size(); i++) {
            answer += listA.get(i) * listB.get(i);
        }
        return answer;
    }
}