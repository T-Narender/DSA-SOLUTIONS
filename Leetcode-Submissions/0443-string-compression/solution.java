class Solution {
    public int compress(char[] chars) {

        int n = chars.length;
        int idx = 0;  

        for (int i = 0; i < n; i++) {

            char ch = chars[i];
            int count = 0;

            // Count same characters
            while (i < n && chars[i] == ch) {
                count++;
                i++;
            }

            // Write character
            chars[idx++] = ch;

            // Write count if > 1
            if (count > 1) {
                String str = String.valueOf(count);
                for (char dig : str.toCharArray()) {
                    chars[idx++] = dig;
                }
            }

            i--; 
        }

        return idx;
    }
}

