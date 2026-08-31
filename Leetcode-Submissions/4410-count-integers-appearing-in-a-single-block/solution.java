class Solution {
    public int countSpecialIntegers(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();

        int n = nums.length;

        hm.put(nums[0],1);

        for(int i=1;i<n;i++){
            if(nums[i]!=nums[i-1]){
                hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            }
        }

        int count = 0;
        for(int v: hm.values()){
            if(v==1){
                count++;
            }
        }

        return count;
    }
}
