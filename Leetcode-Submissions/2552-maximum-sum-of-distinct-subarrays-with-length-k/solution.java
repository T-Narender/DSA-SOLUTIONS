class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long maxSum = 0;
        long currSum = 0;
        HashSet<Integer> set = new HashSet<>();
        int l = 0;

        for(int r=0;r<nums.length;r++){
            while(set.contains(nums[r])){
                set.remove(nums[l]);
                currSum-=nums[l];
                l++;
            }

            set.add(nums[r]);
            currSum+=nums[r];

            if(r-l+1 == k){
                maxSum = Math.max(currSum,maxSum);
                set.remove(nums[l]);
                currSum-=nums[l];
                l++;
            }
        }

        return maxSum;
    }
}
