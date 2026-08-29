class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int currSum = 0;
        int l = 0;
        
        for(int i=0;i<k;i++){
            currSum+=nums[i];
        }
        int maxSum = currSum;
        
        for(int r=k;r<nums.length;r++){
            currSum+=nums[r]-nums[r-k];
            maxSum = Math.max(currSum,maxSum);
        }
        return (double)maxSum/k;
    }
}
