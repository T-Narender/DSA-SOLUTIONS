class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int depth = 0;
        char arr[] = s.toCharArray();
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == '('){
                if(depth>0){
                    res.append('(');
                }
                depth++;
            }
            else{
                depth--;
                if(depth > 0){
                    res.append(')');
                }
            }
        }
        return res.toString();
    }
}
