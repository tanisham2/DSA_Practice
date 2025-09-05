class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int left = 1, right = x, ans = 0;
        while (left <= right) {
            int mid = left + (right - left) / 2;

            // Avoid overflow: use division instead of mid*mid
            if (mid <= x / mid) {
                ans = mid;       // mid is a candidate
                left = mid + 1;  // search right half
            } else {
                right = mid - 1; // search left half
            }
        }
        return ans;
    }
}
