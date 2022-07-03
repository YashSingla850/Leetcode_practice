class Solution {
    public int uniquePaths(int m, int n) {
        int dp [][] =new int [m][n];
        int dir[][] =  {{-1,0},{0,-1}};
        int er  = m-1 , ec = n-1;
        int ans = helper(er , ec, dp ,dir);
        return ans;
        
    }
    public int helper(int er , int ec,int[][]dp, int[][]dir){
      if(er==0||ec==0){
          return 1;
      }
        if(dp[er][ec]!=0){
            return dp[er][ec];
        }
        int count =0;
        for(int d =0;d<dir.length;d++){
            int r = er+dir[d][0];
            int c = ec+dir[d][1];
             if(r>=0 && c>=0&&r<dp.length&&c<dp[0].length){
                 count +=helper(r , c, dp,dir);
             }
            }
        return dp[er][ec] = count;
    }
}