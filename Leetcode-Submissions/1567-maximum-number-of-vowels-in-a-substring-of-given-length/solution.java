class Solution {
    public int maxVowels(String s, int k) {
        int n = s.length();
        int maxVowels=0;
        int currVowels=0;
        int l=0;
        for(int r=0;r<n;r++){
            if(isVowel(s.charAt(r))){
                currVowels++;
            }
            
            if(r-l+1>k){
                if(isVowel(s.charAt(l))){
                    currVowels--;
                }
                l++;
            }

            if(r-l+1 == k){
                maxVowels = Math.max(maxVowels,currVowels);
            }    
        }
        return maxVowels;
    }

    private boolean isVowel(char c){
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
