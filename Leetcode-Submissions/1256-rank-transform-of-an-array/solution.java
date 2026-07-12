class Solution {
    public int[] arrayRankTransform(int[] arr) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] temp = arr.clone();
        Arrays.sort(temp);
        int rank=1;
        for(int num:temp){
            if(!hm.containsKey(num)){
                hm.put(num,rank++);
            }
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=hm.get(arr[i]);
        }
        return arr;
    }
}
