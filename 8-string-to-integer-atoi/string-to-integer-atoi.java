class Solution {
    public int myAtoi(String s) {

        int i = 0;
        int n = s.length();

        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Check sign
        int sign = 1;

        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {

            if (s.charAt(i) == '-') {
                sign = -1;
            }

            i++;
        }

        // 3. Build the number
        int num = 0;

        while (i < n && Character.isDigit(s.charAt(i))) {

            int digit = s.charAt(i) - '0';

            // 4. Check overflow
            if (num > Integer.MAX_VALUE / 10 ||
                (num == Integer.MAX_VALUE / 10 && digit > 7)) {

                if (sign == 1) {
                    return Integer.MAX_VALUE;
                } else {
                    return Integer.MIN_VALUE;
                }
            }

            num = num * 10 + digit;

            i++;
        }

        // 5. Apply sign
        return num * sign;
    }
}