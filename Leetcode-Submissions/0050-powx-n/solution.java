class Solution {
    public double myPow(double x, int n) {
        long N = n; 
       
        if(N<0){
            x=1/x;
            N=-N;
        }
        return pow(x,N);
    }
    private double pow(double x, long n){
         if(n==0){
            return 1;
        }
        double halfPow=pow(x,n/2);
        double halfPowSq=halfPow*halfPow;
        if(n%2!=0)
        {
            halfPowSq=x*halfPowSq;
        }
        return halfPowSq;
    }       
    
}
