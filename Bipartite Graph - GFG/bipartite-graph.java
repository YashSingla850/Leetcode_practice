// { Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            String[] S = br.readLine().trim().split(" ");
            int V = Integer.parseInt(S[0]);
            int E = Integer.parseInt(S[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for(int i = 0; i < V; i++){
                adj.add(new ArrayList<Integer>());
            }
            for(int i = 0; i < E; i++){
                String[] s = br.readLine().trim().split(" ");
                int u = Integer.parseInt(s[0]);
                int v = Integer.parseInt(s[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isBipartite(V, adj);
            if(ans)
                System.out.println("1");
            else System.out.println("0");
       }
    }
}// } Driver Code Ends


class Solution
{
    static class pair{
        int v ;
        int color;
        pair(int v  ,int color){
            this.v = v;
            this.color = color;
        }
    }
    public boolean isBipartite(int V, ArrayList<ArrayList<Integer>>adj)
    {
        // Code here
        int []vis = new int[V];
        for(int v =0;v<V;v++){
            if(vis[v]==0){
                boolean ans =helper(adj , vis , v);
                if(ans==false)return false;
            }
        }
        return true;
    }
    public static boolean helper(ArrayList<ArrayList<Integer>>adj , int[]visited  , int v){
        ArrayDeque<pair>q = new ArrayDeque<>();
        q.add(new pair(v,1));
        while(q.size()>0){
            pair rem = q.remove();
            if(visited[rem.v]!=0){
                int oc = visited[rem.v];
                int nc = rem.color;
                if(oc==nc)continue;
                return false;
    
            }
            visited[rem.v] = rem.color;
            for(int nbr:adj.get(rem.v)){
                if(visited[nbr]==0){
                    q.add(new pair(nbr , rem.color*-1));
                }
            }
            
        }
        return true;
    }
}