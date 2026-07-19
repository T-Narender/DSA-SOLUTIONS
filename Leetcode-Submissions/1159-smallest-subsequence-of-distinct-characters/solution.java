class Solution {
    public String smallestSubsequence(String s) {
        int lastIdx[] = new int[26];
        boolean seen[] = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for(int i=0;i<s.length();i++){
            lastIdx[s.charAt(i)-'a']=i;
        }

        for(int i=0;i<s.length();i++){
            char curr = s.charAt(i);
            int idx = curr-'a';

            if(seen[idx]) continue;

            while(!stack.isEmpty() && stack.peek()>curr && lastIdx[stack.peek()-'a']>i){
                seen[stack.pop()-'a'] = false;
            }

            stack.push(curr);
            seen[idx]=true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }
}
