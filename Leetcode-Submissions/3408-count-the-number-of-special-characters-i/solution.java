class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i = 0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            hm.put(ch,i);
        }
        HashSet<Character> counted = new HashSet<>();
        int count=0;
        for(int i = 0 ; i<word.length(); i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                continue;
            }
            if(Character.isUpperCase(ch)){
                char lowerCh = Character.toLowerCase(ch);

               if(hm.containsKey(lowerCh) && !counted.contains(lowerCh)){
                    count++;
                    counted.add(lowerCh);
                }
            }
        }
        return count;
    }
}
