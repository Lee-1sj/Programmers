package basic.day15;

import java.util.Arrays;

public class Solution2 {
    public int solution(int[] arr) {
        int count = 0;
        int[] copy = Arrays.copyOf(arr, arr.length);
        int[] newArr = new int[arr.length];

        while (true) {
            newArr = function(copy);
            count++;
            if (Arrays.equals(newArr, copy)) {
                break;
            }
            copy = newArr;
        }

        return count - 1;
    }

    public int[] function(int[] arr) {
        int[] newArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) {
                newArr[i] = arr[i] / 2;
            } else if (arr[i] < 50 && arr[i] % 2 == 1) {
                newArr[i] = arr[i] * 2 + 1;
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }
}
