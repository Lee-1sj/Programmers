class Solution {
    public int[] solution(String s) {
        int conversion = 0;
        int count = 0;

        while (!s.equals("1")) {
            count += s.length() - s.replace("0", "").length();
            s = s.replace("0", "");

            int length = s.length();
            s = Integer.toBinaryString(length);
            conversion++;
        }
        return new int[] { conversion, count };
    }
}