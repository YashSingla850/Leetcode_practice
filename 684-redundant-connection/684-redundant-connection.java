class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        parent = new int[edges.length+1];
        rank = new int [edges.length+1];
        for(int i = 0;i<edges.length;i++){
            parent[i] = i;
            rank[i] = 0;
        }
        for(int[]e:edges){
            int xl = find(e[0]);
            int yl = find(e[1]);
            if(xl!=yl){
                union(xl,yl);
            }else{
                  return e;
            }
        }
        return null;
    }
    int []parent;
    int [] rank;
    void union(int xl ,int yl){
          if(rank[xl]<rank[yl]){
              parent[xl]= yl;
          }else if(rank[xl]>rank[yl]){
              parent[yl] = xl;
          }else{
                parent[xl] = yl;
              rank[yl]++;
          }
    }
    int find(int x){
        if(parent[x] == x){
            return parent[x];
        }else{
              int pox = parent[x];
            int sl = find(pox);
            parent[x] = sl;
            return sl;
        }
        
    }
}