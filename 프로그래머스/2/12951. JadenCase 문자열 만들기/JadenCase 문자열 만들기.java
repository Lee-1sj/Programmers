class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        
        if(!Character.isDigit(s.charAt(0))){
            sb.append(Character.toUpperCase(s.charAt(0)));
        } else {
            sb.append(s.charAt(0));
        }
        for(int i=1; i<s.length(); i++){
            char prev = s.charAt(i - 1);
            char current = s.charAt(i);
            if(prev == ' ' && !Character.isDigit(current)){
                sb.append(Character.toUpperCase(current));
            } else {
                sb.append(Character.toLowerCase(current));
            }
        }
        return sb.toString();
    }
}