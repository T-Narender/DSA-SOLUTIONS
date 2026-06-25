class Solution {
    public int minLights(int[] lights) {
        int n = lights.length;
        int ans = 0;

        int[] reach = new int[n];
        Arrays.fill(reach, -1);

        // Store the farthest right endpoint for every left endpoint
        for (int i = 0; i < n; i++) {
            if (lights[i] > 0) {
                int left = Math.max(0, i - lights[i]);
                int right = Math.min(n - 1, i + lights[i]);
                reach[left] = Math.max(reach[left], right);
            }
        }

        int farthest = -1;
        int covered = -1;

        for (int i = 0; i < n; i++) {

            if (reach[i] != -1)
                farthest = Math.max(farthest, reach[i]);

            if (i > covered) {
                if (farthest >= i) {
                    covered = farthest;
                } else {
                    ans++;
                    covered = Math.min(n - 1, i + 2);
                }
            }
        }

        return ans;
    }
}
