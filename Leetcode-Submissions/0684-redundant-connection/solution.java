class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int res[]=new int[n];
        DisjointSet dsu = new DisjointSet(n);
        for(int[] edge:edges){
            if(!dsu.unionBySize(edge[0]-1,edge[1]-1)){
                res=edge;
            }
        }
        return res;
    }
    public class DisjointSet{
        int parent[];
        int size[];
        DisjointSet(int nodes){
            this.parent = new int[nodes];
            this.size = new int[nodes];
            for(int i=0;i<nodes;i++){
                this.parent[i]=i;
                this.size[i]=1;
            }
        }
        public int findRootPar(int node){
            if(node == parent[node]){
                return node;
            }
            parent[node]=findRootPar(parent[node]);
            return parent[node];
        }
        public boolean unionBySize(int node1,int node2){
            int rootPar1 = findRootPar(node1);
            int rootPar2 = findRootPar(node2);
            if(rootPar1==rootPar2){
                return false;
            }
            if(size[rootPar1]<size[rootPar2]){
                parent[rootPar1]=rootPar2;
                size[rootPar2]+=size[rootPar1];
            }
            else{
                parent[rootPar2]=rootPar1;
                size[rootPar1]+=size[rootPar2];
            }
            return true;
        }
    }


}
