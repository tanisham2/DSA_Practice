class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, candidate = 0;
        
        for (int i = 0; i < nums.length; i++) {   // iterate using index
            int num = nums[i];                   // get current element
            
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        
        return candidate;
    }
}
