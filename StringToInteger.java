public class Solution {
    public int myAtoi(String s) {
        int i = 0, n = s.length();
        int sign = 1;
        int result = 0;
        
        // 1. Skip leading whitespaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }
        
        // 2. Check for '+' or '-' sign
        if (i < n) {
            if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            }
        }
        
        // 3. Convert digits into integer
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            
            // 4. Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            
            result = result * 10 + digit;
            i++;
        }
        
        // 5. Apply sign and return result
        return result * sign;
    }
}
