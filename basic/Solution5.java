package basic_test.day3;

public class Solution5 {
	public int solution(int a, int b) {
        int answer = 0;
        String result = "" + a + b;
        int key1 = Integer.parseInt(result);
        int key2 = 2 * a * b;

        if(key1 == key2) {
        	return key1;
        }
        return (key1 > key2)?(key1):(key2);
    }
}
