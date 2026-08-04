class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        ArrayList<Integer> arr = new ArrayList<>();
        boolean[] contains = new boolean[101];
        for(int i=0;i<nums.length;i++){
            if(nums[i]>largest){
                largest = nums[i];
            }
            if(nums[i]<smallest){
                smallest = nums[i];
            }
        }
        for(int num:nums){
            contains[num] = true;
        }
        for(int i=smallest;i<=largest;i++){
            if(!contains[i]){
                arr.add(i);
            }
        }
        return arr;
    }
}
