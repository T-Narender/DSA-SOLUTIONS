class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int ans[] = new int [n];
        int posIdx=0,negIdx=1;
        for(int x:nums){
            if(x>0){
                ans[posIdx]=x;
                posIdx+=2;
            }
            else{
                ans[negIdx]=x;
                negIdx+=2;
            }
        }
        return ans;
    }
}
