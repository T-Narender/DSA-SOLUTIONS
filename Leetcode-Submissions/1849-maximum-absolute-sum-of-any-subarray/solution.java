class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int maxEnding = nums[0];
        int maxSoFar = nums[0];

        int minEnding = nums[0];
        int minSoFar = nums[0];

        for(int i = 1; i < nums.length; i++) {

            maxEnding = Math.max(nums[i], maxEnding + nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEnding);

            minEnding = Math.min(nums[i], minEnding + nums[i]);
            minSoFar = Math.min(minSoFar, minEnding);
        }
        return Math.max(maxSoFar, Math.abs(minSoFar));
    }
}
