class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<Integer> []graph = new ArrayList[n];

        for(int i=0;i<n;i++){
            graph[i] = new ArrayList<>();
        }

        for(int edge[]:edges){
            int u = edge[0];
            int v = edge[1];
            graph[u].add(v);
            graph[v].add(u);
        }

        boolean vis[] = new boolean[n];
        return dfs(source,destination,graph,vis);
    }
    private boolean dfs(int src, int dest,List<Integer>[] graph, boolean[] vis){
        if(src == dest){
            return true;
        }
        vis[src]=true;
        for(int neighbour:graph[src]){
            if(!vis[neighbour]){
                if(dfs(neighbour, dest, graph, vis)){
                    return true;
                }
            }
        }
        return false;
    }
}
