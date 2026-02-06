class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int s=0, e=letters.length-1, ans=0;
        while(s<=e){
            int mid=s+(e-s)/2;
            if(letters[mid]<=target){
                s=mid+1;
            }
            else if(letters[mid]>target){
                e=mid-1;
            }
            ans=s%(letters.length);
        }
        return letters[ans];
    }
}
