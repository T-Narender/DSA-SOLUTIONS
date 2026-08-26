class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int n = s.length();
        int l = 0;
        int count = 0;
        String result = "";

        for(int r=0;r<n;r++){
            if(s.charAt(r) == '1'){
                count++;
            }

            while(count == k){
                if(s.charAt(l) == '1'){
                    String curSubString = s.substring(l,r+1);

                    if(result.isEmpty() || curSubString.length() < result.length()){
                        result = curSubString;
                    }

                    else if(curSubString.length() == result.length()){
                        if(curSubString.compareTo(result)<0){
                            result = curSubString;
                        }
                    }

                    count--;
                }
                l++;
            }
        }
        return result;
        
    }
}
