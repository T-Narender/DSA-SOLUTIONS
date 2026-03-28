class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int temp=0;
        int ans=0;
        int l=0;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                temp++;
            }
            while(temp>k){
                if(nums[l]==0){
                    temp--;
                }
                 l=l+1;
            }
         
            ans=Math.max(ans,r-l+1);
        }
        return ans;
    }
}
