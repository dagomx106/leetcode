package leetcode;

public class RunningSum1DArray {

    public static void runningSum (int...values){

        int[] res = new int[values.length];
        int sum = 0;

        for (int i = 0; i < values.length; i++) {
            sum += values[i];
            res[i] = sum;
        }
        for (int e : res){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        runningSum(2, 4, 2, 3, -15);
    }
}
