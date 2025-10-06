class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer,Integer> hash =  new HashMap<>();

        for (int i=0; i<arr.length; i++) {
            int ele = arr[i];
            if (hash.containsKey(ele) == true) {
                hash.put(ele, hash.get(ele)+1);
            }
            else {
                hash.put(ele, 1);
            }
        }     
        int ans = -1;
        for (int key : hash.keySet()) {
            if (hash.get(key) ==  key) {
                ans = Math.max(ans, key);
            }
        }
        return ans;  
    }
}
