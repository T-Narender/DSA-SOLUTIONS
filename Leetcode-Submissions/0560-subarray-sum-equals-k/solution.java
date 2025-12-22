// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int cnt=0;
//        for (int i=0;i<nums.length;i++){
//             int sum=nums[i];
//             if(sum==k){
//                 cnt++;
//             }
//             for(int j=i+1;j<nums.length;j++){
//                 sum+=nums[j];
//                 if(sum==k){
//                     cnt++;
//                 }
//             }
           
//        }
//         return cnt;
        
//     }
// }

class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int [] prefix = new int[n];
        prefix[0]=nums[0];
        for(int i=1;i<n;i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0, 1);
        int ans=0;
        
        for (int i = 0; i < n; i++) {
           
            if (map.containsKey(prefix[i] - k)) {
                ans += map.get(prefix[i] - k);
            }
            map.put(prefix[i], map.getOrDefault(prefix[i], 0) + 1);
        }
        return ans;
        
    }
}



