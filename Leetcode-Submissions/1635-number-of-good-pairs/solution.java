class Solution {
    public int numIdenticalPairs(int[] nums) {
        int goodPairs=0;
        int freq[]=new int[101];
        for(int num:nums){
            goodPairs+=freq[num];
            freq[num]++;
        }
        return goodPairs;
    }
}
