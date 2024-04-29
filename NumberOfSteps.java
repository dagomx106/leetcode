package leetcode;

public class NumberOfSteps {

    public static int reduceToZero(int n){
        int step = 0;

        while (n>0) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n--;
            }
            step++;
        }
        return step;
    }

    public static void main(String[] args) {
        System.out.println(reduceToZero(14));
    }
}
