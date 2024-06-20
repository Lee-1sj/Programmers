class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};
        int area = brown + yellow;
        
        for (int height = 3; height <= (int) (Math.sqrt(area)); height++) {
            if (area % height == 0) {
                int width = area / height;
                if((width - 2) * (height - 2) == yellow){
                    answer = new int[]{width, height};
                }
            }
        }

        return answer;
    }
}