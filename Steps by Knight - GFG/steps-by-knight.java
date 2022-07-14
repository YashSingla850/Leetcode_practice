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
            int N = Integer.parseInt(br.readLine().trim());
            String[] S1 = br.readLine().trim().split(" ");
            String[] S2 = br.readLine().trim().split(" ");
            int[] KnightPos = new int[2];
            int[] TargetPos = new int[2];
            for(int i = 0; i < 2; i++){
                KnightPos[i] = Integer.parseInt(S1[i]);
                TargetPos[i] = Integer.parseInt(S2[i]);
            }
            Solution obj = new Solution();
            int ans = obj.minStepToReachTarget(KnightPos, TargetPos, N);
            System.out.println(ans);
       }
    }
}
// } Driver Code Ends


class Solution
{
    class pair{
        int i ; 
        int j ;
        int dist;
        pair(int i , int j, int dist){
            this.i = i;
            this.j =j;
            this.dist = dist;
        }
    }
    //Function to find out minimum steps Knight needs to reach target position.
    public int minStepToReachTarget(int KnightPos[], int TargetPos[], int N)
    {
        ArrayDeque<pair> q = new ArrayDeque<>();
    boolean [][]visited = new boolean[N+1][N+1];
    int ans = 0;
  
          if(visited[KnightPos[0]][KnightPos[1]]==false){
            ans  = bfs(KnightPos[0],KnightPos[1] , visited , q,TargetPos, N);
          }
          return ans;
    //   q.add(new pair(knightPos[0],knightPos[1] , 0 ));
    }
    public int bfs(int sr,int sc,boolean[][]visited , ArrayDeque<pair>q ,int []target ,int n){
        q.add(new pair(sr,sc , 0 ));
        int[][]dir ={{1, 2}, {1, -2}, {-1, 2}, {-1, -2}, {2, 1}, {-2, 1}, {2, -1}, {-2, -1}};
        while(q.size()>0){
            pair rem = q.remove();
            if(visited[rem.i][rem.j]==true){
                continue;
            }
            
            visited[rem.i][rem.j]= true;
            if(rem.i==target[0] &&rem.j==target[1]){
                return rem.dist;
            }
             for(int d =0 ;d<dir.length;d++){
                 int i = rem.i+dir[d][0];
                 int j = rem.j+dir[d][1];
                 if(i>=1 && j>=1 && i<=n && j<=n && visited[i][j]==false){
                     q.add(new pair(i , j , rem.dist+1));
                 }
             }
        }
        return -1;
    }
}