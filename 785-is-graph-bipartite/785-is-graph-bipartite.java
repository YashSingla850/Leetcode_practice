class Solution {
    class pair{
        int v;
        int color;
        pair(int v, int color){
            this.v = v;
            this.color=color;
        }
    }
    
    public boolean isBipartite(int[][] graph) {
        
        int []visited = new int[graph.length];
        for(int v =0;v<graph.length;v++){
            if(visited[v]==0){
                boolean ans = helper(graph , visited , v);
                if(ans==false){
                    return false;
                }
            }
        }
        return true;
    }
    
    public boolean helper(int[][]graph ,int[]visited , int v){
        ArrayDeque<pair>queue = new ArrayDeque<>();
        queue.add(new pair(v,1));
        while(queue.size()>0){
            pair rem = queue.remove();
            if(visited[rem.v]!=0){
                int oc = visited[rem.v];
                int nc  = rem.color;
                if(oc==nc)continue;
                return false;
            }
            visited[rem.v] = rem.color;
            for(int nbr:graph[rem.v]){
                if(visited[nbr]==0){
                    queue.add(new pair(nbr , rem.color*-1));
                }
            }
        }
        return true;
    }
}