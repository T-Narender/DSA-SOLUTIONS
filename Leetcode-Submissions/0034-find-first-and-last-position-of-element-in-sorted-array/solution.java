
class Solution {

    public int[] searchRange(int[] nums, int target) {
        int first = binarySearch(nums, target, true);
        int last = binarySearch(nums, target, false);
        return new int[]{first, last};
    }

    private int binarySearch(int[] nums, int target, boolean isLeft) {
        int s = 0, e = nums.length - 1;
        int idx = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] < target) {
                s = mid + 1;
            } else if (nums[mid] > target) {
                e = mid - 1;
            } else {
                idx = mid; // target found
                if (isLeft) {
                    e = mid - 1;   // move left
                } else {
                    s = mid + 1;   // move right
                }
            }
        }
        return idx;
    }
}

