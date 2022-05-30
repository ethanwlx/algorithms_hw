class Solution {
    public int[] plusOne(int[] digits) {
        int right = digits.length - 1;
        while (right > -1) {
            if (digits[right] != 9) {
                digits[right]++;
                return digits;
            }
            digits[right--] = 0;
        }
        int[] res = new int[digits.length + 1];
        res[0] = 1;
        return res;
    }
}