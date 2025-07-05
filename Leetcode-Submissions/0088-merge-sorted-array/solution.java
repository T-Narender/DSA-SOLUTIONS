class Solution {
    public void merge(int[] nums1, int m, int[] c, int n) {
        int newSize = m+n;
        int[] newArray = new int[newSize];
        int i = 0, j = 0, k = 0;
        
        while (i < m || j < n) {
            if (j == n || (i <m && nums1[i] < c[j])) {
                newArray[k] = nums1[i];
                i++;
            } else {
                newArray[k] = c[j];
                j++;
            }
            k++;
        }
        for(int t=0;t<newSize;t++){
            nums1[t]=newArray[t];
        }
    }
}
