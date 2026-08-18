class Solution {
    public int largestInteger(int[] nums, int k) {
        int n = nums.length;
        // case - 1 : k == n
        if(k == n){
            int max = -1;
            for(int num:nums){
                max = Math.max(max,num);
            }
            return max;
        }

        Map<Integer,Integer> counts = new HashMap<>();
        for(int num:nums){
            counts.put(num,counts.getOrDefault(num,0)+1);
        }

        // case 2: k==1
        if(k == 1){
            int max = -1;
            for(int num:nums){
                if(counts.get(num) == 1){
                    max = Math.max(max,num);
                }
            }
            return max;
        }

        // case 3: Only nums[0] or nums[n-1] can be present in exactly one subarray
        int ans = -1;
        if(counts.get(nums[0]) == 1){
            ans = Math.max(ans,nums[0]);
        }
        if(counts.get(nums[n-1]) == 1){
            ans = Math.max(ans,nums[n-1]);
        }
        return ans;
    }
}
