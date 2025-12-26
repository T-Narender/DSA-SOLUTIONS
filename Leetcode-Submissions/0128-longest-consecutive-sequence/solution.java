class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length==0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int longest=0;
        for(int num: set){
            if(!set.contains(num-1)){
                int currNum=num;
                int cnt=1;
                while(set.contains(currNum+1)){
                    currNum++;
                    cnt++;
                }
                longest=(Math.max(longest,cnt));
            }
        }
        return longest;
        
    }

  
}
