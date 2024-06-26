package leetcode;

import java.util.Arrays;

public class FindPivotIndex {

    public static int findPivot(int[] values) {

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < values.length; i++) {
            sumLeft = sumLeft + Arrays.stream(values, 0, i).sum();
            sumRight = sumRight + Arrays.stream(values, i + 1, values.length).sum();
            if(sumLeft == sumRight) return i;
            sumLeft = 0;
            sumRight = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findPivot(new int[]{3, 3, 7, 9, 5,8}));
    }
}
