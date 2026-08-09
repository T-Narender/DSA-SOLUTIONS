class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int maxDepth = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            char ch = s.charAt(i);
            if(ch == '('){
                count++;
                maxDepth = Math.max(count,maxDepth);
            }
            if(ch == ')'){
                count--;
            }
        }
        return maxDepth;
    }
}
