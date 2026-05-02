class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        int duplicates = 0;
        long windowSum = 0;
        long maxSum = 0;
        for(int right = 0; right<nums.length; right++){
            int incoming = nums[right];
            freq.put(incoming,freq.getOrDefault(incoming,0)+1);
            if(freq.get(incoming)==2) duplicates++;
            windowSum +=incoming;
            if(right<k-1) continue;

            if(duplicates == 0){
                maxSum=Math.max(maxSum , windowSum);
            }
            int left = right-k+1;
            int outgoing = nums[left];
            if(freq.get(outgoing) == 2) duplicates--;
            freq.put(outgoing, freq.get(outgoing)-1);
            if(freq.get(outgoing)==0) freq.remove(outgoing);
            windowSum-=outgoing;
        }
        return maxSum;
    }
}
