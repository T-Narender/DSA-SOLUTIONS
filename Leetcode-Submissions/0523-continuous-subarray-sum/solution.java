class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length<2){
            return false;
        }
       int n = nums.length;
       Map<Integer,Integer> map = new HashMap<>();
       map.put(0,-1);
       int prefixSum = 0;
       for(int i=0;i<n;i++){
        prefixSum+=nums[i];
        int rem = prefixSum%k;
        if(map.containsKey(rem)){
            if(i-map.get(rem)>=2){
                return true;
            }
        }
        else{
            map.put(rem,i);
        }
       }
       return false;

    }
}
