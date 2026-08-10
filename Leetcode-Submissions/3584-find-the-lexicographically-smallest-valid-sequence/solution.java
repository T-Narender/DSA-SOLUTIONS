class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        int []rightSideMatchLen = new int[n];
        int rightMatched = 0;
        int i = n-1;
        int j = m-1;
        while(i>=0){
            if(j>=0 && word1.charAt(i) == word2.charAt(j)){
                rightMatched++;
                j--;
            }
            rightSideMatchLen[i] = rightMatched;
            i--;
        }
        List<Integer> seq = new ArrayList<>();
        boolean changePow = true;
        
        i=0;
        j=0;
        while(i<n && j<m){
            if(word1.charAt(i) == word2.charAt((j))){
                seq.add(i);
                j++;
            }
            else if(changePow && i+1 < n && rightSideMatchLen[i + 1] >= (m - j - 1)){
                seq.add(i);
                j++;
                changePow = false;
            }
            i++;
        }

        if(j==m){
            int[] res = new int[seq.size()];
            for(int k=0;k<seq.size();k++){
                res[k] = seq.get(k);
            }
            return res;
        }
        return new int[0];
    }
}
