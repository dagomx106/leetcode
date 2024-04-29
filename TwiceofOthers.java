package leetcode;

import java.util.Arrays;

public class TwiceofOthers {
    public static int Twice(int[] values) {

        int index=0;
        int max = Arrays.stream(values).max().getAsInt();
        for (int j = 0; j < values.length ; j++) {
            if (values[j] == max){
                index = j;
            }}

        for (int i = 0; i < values.length; i++) {
            if((i != index) && (values[i]*2) > values[index]){
                return -1;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        System.out.println(Twice(new int[]{3,6,1,0}));
    }
}
