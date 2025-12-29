// class Solution {
//     public String reverseWords(String s) {
//         String[] str=s.trim().split("//s+");
//         String out="";
//         for(int i=str.length-1;i>0;i--){
//             out+=str[i]+" ";
//         }
//         return out+str[0];
//     }
// }


class Solution {
    public String reverseWords(String s) {
        String[] arr = s.trim().split("\\s+");
        int i=0,j=arr.length-1;
        while(i<j) {
            String t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        return String.join(" ", arr);
    }
}
