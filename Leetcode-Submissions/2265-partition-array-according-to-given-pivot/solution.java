class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left = 0;
        int right = nums.length-1;
        int[] result = new int[nums.length];

        for(int i=0, j=nums.length-1; i<nums.length;i++,j--){
            if(nums[i]<pivot){
                result[left++]=nums[i];
            }
            if(nums[j]>pivot){
                result[right--]=nums[j];
            }
        }

        while(left<=right){
            result[left++]=pivot;
        }

        return result;
    }
}
