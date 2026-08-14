class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer> freq = new HashMap<>();
        int l = 0;
        int len = 0;
        for(int r=0;r<s.length();r++){
            char ch = s.charAt(r);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>2){
                char leftChar = s.charAt(l);
                freq.put(leftChar,freq.get(leftChar)-1);
                l++;
            }
            len = Math.max(len,r-l+1);
        }
        return len;


    }
}
