class Solution {
    public int largestInteger(int n, int s) {
        if(s==0){
            return 0;
        }
        int start = 0;
        for (int i = 0; i < n; i++) {
            start = start * 10 + 9;
        }
        
        for (int i = start; i >= 0; i--) {
            if (getDigitSum(i) == s) {
                return i;
            }
        }
        
        return -1;
    }

    private int getDigitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
