class Solution {
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int er = n-1,ec = m-1;
        int dp [][]=  new int [n][m];
        for(int []d :dp) Arrays.fill(d,-1);
        int dir[][] = {{-1,0},{0,-1}};
       int ans =  helper(er , ec, dp , dir , grid);
        return ans;
    }
    public int helper(int er , int ec, int[][]dp , int [][]dir , int [][]grid){
          if(er==0&&ec==0){
           return  dp[er][ec] = grid[er][ec];
           }
        if(dp[er][ec]!=-1){
            return dp[er][ec];
        }
        int min = (int)1e9;
        for(int d = 0;d<dir.length;d++){
            int r = er+dir[d][0];
            int c = ec+dir[d][1];
            if(r>=0 && c>=0 && r<grid.length && c<grid[0].length){
                min = Math.min(min, helper(r , c, dp ,dir, grid));
             }
        }
        return dp[er][ec] = min+grid[er][ec];
    }
}