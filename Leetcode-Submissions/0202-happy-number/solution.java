class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = n;

        do{
            slow = getNext(slow);
            fast = getNext(getNext(fast));

            if(fast == 1){
                return true;
            }
        }while(slow!=fast);

        return false;
    }

    private int getNext(int n){
        int totalSum = 0;
        while(n>0){
            int digit = n%10;
            totalSum += digit*digit;
            n/=10; 
        }
        return totalSum;
    }
}
