class Solution {
    public int findGCD(int[] nums) {
        int min = 1001, max = 0;

        for (int num : nums) {
            if (num < min)
                min = num;
            if (num > max)
                max = num;
        }

        return gcd(min, max);
    }
    public int gcd(int a,int b){
        while (b != 0) {
            int rem = a % b;
            a = b;
            b = rem;
        }
        return a;

    }
}
