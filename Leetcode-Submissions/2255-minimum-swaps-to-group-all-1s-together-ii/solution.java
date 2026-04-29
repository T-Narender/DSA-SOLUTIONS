class Solution {
    public int minSwaps(int[] nums) {

        int n = nums.length;
        int totalOnes = 0;

        for (int value : nums) {
            if (value == 1) totalOnes++;
        }

        if (totalOnes == 0 || totalOnes == 1) return 0;

        int currentZeros = 0;

        for (int i = 0; i < totalOnes; i++) {
            if (nums[i % n] == 0) currentZeros++;
        }

        int minSwapsNeeded = currentZeros;

        for (int right = totalOnes; right < n + totalOnes; right++) {

            int left = right - totalOnes;

            if (nums[left % n] == 0) currentZeros--;

            if (nums[right % n] == 0) currentZeros++;

            minSwapsNeeded = Math.min(minSwapsNeeded, currentZeros);
        }

        return minSwapsNeeded;
    }
}
