class Solution {
    public int solution(int n) {
        int current = countOne(n);
        int next = n + 1;

        while (countOne(next) != current) {
            next++;
        }

        return next;
    }
    
    private int countOne(int n) {
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n >>= 1;
        }
        return count;
    }
}