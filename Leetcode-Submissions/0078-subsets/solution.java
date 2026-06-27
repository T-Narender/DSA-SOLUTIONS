class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0,nums,new ArrayList<>(),res);
        return res;
    }

    private void backtrack(int idx,int[] nums,List<Integer> curr,List<List<Integer>> res){
        //base case
        if(idx==nums.length){
            res.add(new ArrayList<>(curr));
            return;
        }
        //choice 1 include-
        curr.add(nums[idx]);
        backtrack(idx+1,nums,curr,res);

        //choice 2 exclude-
        curr.remove(curr.size()-1);
        backtrack(idx+1,nums,curr,res);
    }
}
