class Solution {
    public int tribonacci(int n) {
        if (n==0) {
            return 0;
        }
        else if (n==1 || n==2) {
            return 1;
        }
        else {
            int firstT = 0;
            int secondT = 1;
            int thirdT = 1;

            for (int i=1; i<=n; i++) {
                int fourthT = firstT + secondT+ thirdT;
                firstT = secondT;
                secondT = thirdT;
                thirdT = fourthT;
            }
            return firstT;
        }
    }
