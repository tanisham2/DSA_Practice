class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        int[] count = new int[26];
        
        // Count chars in s
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }
        
        // Subtract chars in t
        for (char c : t.toCharArray()) {
            count[c - 'a']--;
        }
        
        // Check if all counts are zero
        for (int c : count) {
            if (c != 0) return false;
        }
        
        return true;
    }
}
