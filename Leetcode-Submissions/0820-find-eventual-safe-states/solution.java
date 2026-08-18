class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int V = graph.length;

        List<List<Integer>> adjRev = new ArrayList<>();
        for(int i=0;i<V;i++){
            adjRev.add(new ArrayList<>());
        }   

        int[] indegree = new int[V];
        for(int i=0;i<V;i++){
            for(int it:graph[i]){
                adjRev.get(it).add(i);
                indegree[i]++;
            }
        }

        Queue<Integer> queue = new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }

        List<Integer> safeNodes = new ArrayList<>();
        while(!queue.isEmpty()){
            int node = queue.poll();
            safeNodes.add(node);

            for(int neighbor : adjRev.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor]==0){
                    queue.add(neighbor);
                }
            }
        }
        Collections.sort(safeNodes);
        return safeNodes;
       
    }
}
