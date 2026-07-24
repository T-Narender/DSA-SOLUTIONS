class Solution {
    public int uniqueXorTriplets(int[] nums) {
        int MAX = 2048;
        boolean[] pairXor = new boolean[MAX];
        int n = nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pairXor[nums[i]^nums[j]]=true;
            }
        }
        boolean result[] = new boolean[MAX];
        for(int j=0;j<MAX;j++){
            if(!pairXor[j]) continue;

            for(int num : nums){
                result[j^num] = true;
            }
        }

        int count =0;
        for(boolean value: result){
            if(value) count++;
        }

        return count;
    }
    
}
