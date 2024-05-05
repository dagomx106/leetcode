package leetcode;

import java.util.Arrays;

public class PlusOne {

    public static int[] plusOne(int[] digits) {

        int carry = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            // Add carry to the current digit
            digits[i] += carry;
            // If the sum is less than 10, we're done for this digit
            if (digits[i] < 10) {
                carry = 0;
                break;
            }

            // Otherwise, reset the digit to 0 and carry over 1
            else {
                digits[i] = 0;
            }
        }

        // If there's still carry after processing all digits, add a new leading 1
        if (carry == 1) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }

        return digits;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(plusOne(new int[]{6,1,4,5,3,9,0,1,9,5,1,8,6,7,0,5,5,4,3})));
    }
}
