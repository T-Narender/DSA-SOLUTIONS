class Solution {
    public int longestSubsequence(int[] nums) {
        int n = nums.length;
        int resXor = 0;
        boolean allZero = true;

        for(int x:nums){
            resXor = (resXor ^ x);
            if(x!=0){
                allZero=false;
            }
        }

        if(allZero==true){
            return 0;
        }

        return (resXor == 0) ? n-1 : n;
    }
}
