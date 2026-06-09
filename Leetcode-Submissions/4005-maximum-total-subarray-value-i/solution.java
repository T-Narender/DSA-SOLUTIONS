class Solution {
    public long maxTotalValue(int[] nums, int k) {
        int maxVal = Integer.MIN_VALUE;
        int minVal = Integer.MAX_VALUE;
        int n = nums.length;
        int ans=0;
        if(n == 1){
            return 0;
        }

        for(int j=0;j<n;j++){
            maxVal = Math.max(maxVal,nums[j]);
            minVal = Math.min(minVal,nums[j]);
            ans = maxVal-minVal;
        }
        return (long)k*ans;
    }
}
