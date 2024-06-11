import java.util.Stack;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        for(char data : s.toCharArray()){
            if(data == '('){
                stack.push('(');
            }else {
                if(stack.isEmpty()){
                    return false;
                }else{
                    stack.pop();
                }
            }
        }
        if(!stack.isEmpty()){
            answer = false;
        }

        return answer;
    }
}