class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length , m = grid[0].length;
     int dp[][] = new int[n][m];
        for(int[]d:dp)Arrays.fill(d,-1);
         return helper(grid , dp  , n-1 , m-1);
    }
    public int helper(int[][]grid , int[][]dp , int sr , int sc){
        if(sr==0&&sc==0){
            return dp[sr][sc] = grid[sr][sc];
        }
       
        if(sr<0|| sc<0 || sr>= grid.length || sc>=grid[0].length){
            return Integer.MAX_VALUE;
        }
        if(dp[sr][sc]!=-1)return dp[sr][sc];
        
         int min  = (int)1e9;
        
          int a =  helper(grid, dp , sr-1 , sc);
        int b = helper(grid , dp , sr , sc-1);
        
        min = Math.min(min , Math.min(a , b));
      return  dp[sr][sc] = min+grid[sr][sc];
    }
}

































// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n = grid.length, m = grid[0].length;
//         int er = n-1,ec = m-1;
//         int dp [][]=  new int [n][m];
//         for(int []d :dp) Arrays.fill(d,-1);
//         int dir[][] = {{-1,0},{0,-1}};
//        int ans =  helper(er , ec, dp , dir , grid);
//         return ans;
//     }
//     public int helper(int Er , int Ec, int[][]dp , int [][]dir , int [][]grid){
//         for(int er = 0;er<=Er;er++){
//             for(int ec = 0;ec<=Ec;ec++){
//                 if(er==0&&ec==0){
//                       dp[er][ec] = grid[er][ec];
//                     continue;
//                }
                
//             int min = (int)1e9;
//             for(int d = 0;d<dir.length;d++){
//                 int r = er+dir[d][0];
//                 int c = ec+dir[d][1];
//                 if(r>=0 && c>=0 && r<grid.length && c<grid[0].length){
//                     min = Math.min(min, dp[r][c]);
//                  }
//             }
//                dp[er][ec] = min+grid[er][ec];

//             }
//         }
//         return dp[Er][Ec];
         
//     }
// }

//  MEMOIZATION -:

// class Solution {
//     public int minPathSum(int[][] grid) {
//         int n = grid.length, m = grid[0].length;
//         int er = n-1,ec = m-1;
//         int dp [][]=  new int [n][m];
//         for(int []d :dp) Arrays.fill(d,-1);
//         int dir[][] = {{-1,0},{0,-1}};
//        int ans =  helper(er , ec, dp , dir , grid);
//         return ans;
//     }
//     public int helper(int er , int ec, int[][]dp , int [][]dir , int [][]grid){
//           if(er==0&&ec==0){
//            return  dp[er][ec] = grid[er][ec];
//            }
//         if(dp[er][ec]!=-1){
//             return dp[er][ec];
//         }
//         int min = (int)1e9;
//         for(int d = 0;d<dir.length;d++){
//             int r = er+dir[d][0];
//             int c = ec+dir[d][1];
//             if(r>=0 && c>=0 && r<grid.length && c<grid[0].length){
//                 min = Math.min(min, helper(r , c, dp ,dir, grid));
//              }
//         }
//         return dp[er][ec] = min+grid[er][ec];
//     }
// }