class Solution {
    public int maxProduct(int n) {
        int first = 0;
        int sec = 0;
        while(n>0){
            int curr = n%10;
            if(curr > first){
                sec = first;
                first = curr;
            }
            else if(curr > sec){
                sec = curr;
            }
            n/=10;
        }
        return first*sec;
    }
}
