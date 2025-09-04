class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int capitalCount = 0;

        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                capitalCount++;
            }
        }

        if (capitalCount == n) return true;               // All caps
        if (capitalCount == 0) return true;               // All lowercase
        if (capitalCount == 1 && Character.isUpperCase(word.charAt(0))) 
            return true;                                  // First only
        return false;
    }
}
