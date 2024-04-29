package leetcode;

import java.util.Arrays;

public class RichestCustomer {

    static int accounts(int[][] values){

        int[] sum= new int[3];
        for (int i = 0; i < values.length; i++) {
           sum[i] = Arrays.stream(values[i]).sum();
        }
        return Arrays.stream(sum).max().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(accounts(new int[][]{{1, 1, 2}, {3, 3, 3}, {3, 3, 4}}));
    }
}
