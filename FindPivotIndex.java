package leetcode;

public class FindPivotIndex {

    public static int findPivot(int[] values) {

        int sumLeft = 0;
        int sumRight = 0;
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < i; j++){
                sumLeft += values[j];}
            for (int j = i + 1; j < values.length; j++){
                sumRight += values[j];}
            if(sumLeft == sumRight){
                return i;
                }
            sumLeft = 0;
            sumRight = 0;
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(findPivot(new int[]{3, 3, 7, 9, 5,8}));
    }
}
