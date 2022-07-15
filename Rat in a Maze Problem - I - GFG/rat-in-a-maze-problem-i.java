// { Driver Code Starts
// Initial Template for Java

import java.util.*;
class Rat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int i = 0; i < n; i++)
                for (int j = 0; j < n; j++) a[i][j] = sc.nextInt();

            Solution obj = new Solution();
            ArrayList<String> res = obj.findPath(a, n);
            Collections.sort(res);
            if (res.size() > 0) {
                for (int i = 0; i < res.size(); i++)
                    System.out.print(res.get(i) + " ");
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
    }
}
// } Driver Code Ends


class Solution {
    static ArrayList<String>list;
    public static ArrayList<String> findPath(int[][] m, int n) {
        list = new ArrayList<>();
        int len = m.length;
        boolean visited[][] = new boolean[len][len];
         if(visited[0][0]==false){
             dfs( m , 0, 0,"", visited,list);
         }
         return list;
   }
   public static void dfs(int[][]m , int sr , int sc ,String psf, boolean[][]visited , ArrayList<String>list){
      int[][]dir = {{1,0},{0,1},{-1,0},{0,-1}};
      char [] help = {'D','R','U','L'};
      if(visited[sr][sc]==true|| m[sr][sc] == 0){
          return;
      }
      visited[sr][sc] = true;
        if(sr == m.length-1 && sc == m.length-1){
            list.add(psf);
        }
      for(int d= 0 ;d<dir.length;d++){
          int i= sr+dir[d][0];
          int j = sc+ dir[d][1];
          if(i>=0 && j>=0 && i<m.length && j<m.length ){
              dfs(m , i , j, psf+help[d], visited , list);
          }
      }
      visited[sr][sc]= false;
   }
}



// class Solution {
//     static ArrayList<String>list;
//     public static ArrayList<String> findPath(int[][] m, int n) {
//         // Your code here
//          list= new ArrayList<>();
//          boolean[][]visited= new boolean[n][n];
//           if(visited[0][0]==false){
//               dfs(m , 0 ,0 ,visited  ,n-1, n-1,"");
//           }
//           return list;
//     }
//           public static void dfs(int[][]m ,int sr , int sc ,boolean[][]visited ,int dr , int dc , String psf){
             
//               if(visited[sr][sc]==true||m[sr][sc]==0)return;
              
//               visited[sr][sc] = true;
//                 if(sr==dr&&sc==dc){
//                   list.add(psf);
//               }
               
//               if(sr+1<m.length&&m[sr+1][sc]==1){
//               dfs(m,sr+1,sc, visited , dr , sc, psf+'D');
//               }
//               if(sr-1>=0&&m[sr-1][sc]==1){
//               dfs(m,sr-1,sc, visited , dr , sc, psf+'U');
//               }
//               if(sc-1>=0&&m[sr][sc-1]==1){
//               dfs(m,sr,sc-1, visited , dr , sc, psf+'L');
//               }
//               if(sc+1<m.length&&m[sr][sc+1]==1){
//               dfs(m,sr,sc+1, visited , dr , sc, psf+'R');
//               }
//               visited[sr][sc] = false;
//           }
    
// }