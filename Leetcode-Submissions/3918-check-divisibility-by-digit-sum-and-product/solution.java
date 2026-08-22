class Solution {
    public boolean checkDivisibility(int n) {
        int val = n;
        long sum = 0;
        long prod = 1;
        while(n>0){
            int digit = n % 10;
            sum+=digit;
            prod*=digit;
            n/=10;
        }

        long res = sum+prod;
        if(res==0){
            return false;
        }
        return val%res == 0;
    }
}
