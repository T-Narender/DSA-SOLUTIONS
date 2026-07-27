class Solution {
    public int maxProduct(int[] nums) {
        int big = 0;
        int secBig = 0;
        for(int num : nums){
            if(num > big){
                secBig = big;
                big = num;
            }
            else{
                secBig = Math.max(secBig,num);
            }
        }
        return (big-1)*(secBig-1);
    }
}
