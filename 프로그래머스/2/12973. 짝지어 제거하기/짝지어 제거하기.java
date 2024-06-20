import java.util.Stack;

class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<Character> st = new Stack<>();
        
        for(char data : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == data){
                st.pop();
            } else {
                st.push(data);
            }
        }
        answer = (st.isEmpty())?(1):(0);
        
        return answer;
    }
}