class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        // int ans=0;
        // int n= nums.size();
        // for(int i=0;i<n;i++){
        //     ans=ans^nums[i];
        // }
        // for(int i=0;i<n;i++){
        //     ans=ans^i;
        // }
        // return ans;
        int j=1;
        for(int i = 1; i < nums.size(); i++){
            if(nums[i] != nums[i - 1]){
                nums[j] = nums[i];
                j++;
            }
        }
        return j;
    }
};
