package basic.day12;

import java.util.ArrayList;
import java.util.List;

public class Solution1 {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        List<Integer> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        int a = slicer[0];
        int b = slicer[1];
        int c = slicer[2];

        for (int data : num_list) {
            list.add(data);
        }

        switch (n) {
            case 1:
                result = list.subList(0, b + 1);
                break;
            case 2:
                result = list.subList(a, list.size());
                break;
            case 3:
                result = list.subList(a, b + 1);
                break;
            case 4:
                for (int i = a; i <= b; i += c) {
                    result.add(list.get(i));
                }
                break;
            default:
                break;
        }

        int[] solution = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            solution[i] = result.get(i);
        }

        return solution;
    }
}
