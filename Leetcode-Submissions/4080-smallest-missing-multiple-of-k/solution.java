class Solution {
    public int missingMultiple(int[] nums, int k) {
        Arrays.sort(nums);
        int targetMultiple  = k;
        for(int num:nums){
            if(num == targetMultiple){
                targetMultiple += k;
            }
            if(num>targetMultiple){
                return targetMultiple;
            }
        }
        return targetMultiple;
    }
}
