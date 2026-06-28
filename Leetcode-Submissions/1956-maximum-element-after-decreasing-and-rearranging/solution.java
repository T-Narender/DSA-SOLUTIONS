class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);

        int curr=1;
        for(int i=1;i<arr.length;i++){
            curr=Math.min(arr[i],curr+1);
        }
        return curr;
    }
}
