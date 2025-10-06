class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int actualS= (n*(n+1))/2;
        int currS = 0;
        for (int i=0; i<n; i++) {
            currS = currS + nums[i];
        }
        int ans = actualS - currS;
        return ans;
    }
}
