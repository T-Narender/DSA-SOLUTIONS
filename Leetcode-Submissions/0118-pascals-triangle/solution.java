class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();

        for(int row=0;row<numRows;row++){
            List<Integer> curr = new ArrayList<>();
            long val = 1;
            
            for(int col=0;col<=row;col++){
                curr.add((int) val);
                val = val*(row-col)/(col+1);
            }
            res.add(curr);
        }
        return res;
    }
}
