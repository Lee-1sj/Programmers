package basic.day15;

public class Solution5 {
    public int solution(String myString, String pat) {
        if (myString.length() < pat.length()) {
            return 0;
        } else {
            if (myString.toLowerCase().contains(pat.toLowerCase())) {
                return 1;
            } else {
                return 0;
            }
        }

    }
}
