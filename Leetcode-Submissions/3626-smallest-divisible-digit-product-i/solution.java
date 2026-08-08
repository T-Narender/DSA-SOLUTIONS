class Solution {
    public int smallestNumber(int n, int t) {
        while(true){
            if(getProd(n)%t == 0){
                return n;
            }
            n++;
        }
    }
    private int getProd(int num){
        int prod = 1;
        while(num>0){
            int digit = num%10;
            if(digit==0){
                return 0;
            }
            prod*=digit;
            num/=10;
        }
        return prod;
    }
}
