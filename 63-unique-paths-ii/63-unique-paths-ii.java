class Solution {
    public int uniquePathsWithObstacles(int[][] grid) {
       int n = grid.length , m = grid[0].length , Er = n-1 , Ec = m-1;
        if(grid[0][0]==1  || grid[Er][Ec]==1){
            return 0;
        }
        int dp[][] = new int[n][m];
        for(int i =0;i<n;i++){
            for(int j =0;j<m;j++){
                dp[i][j] = -1;
            }
        }
        int dir[][] = {{-1,0},{0,-1}};
        for(int er =0;er<=Er;er++){
            for(int ec =0;ec<=Ec;ec++){
                if(er==0&&ec==0){
                   dp[er][ec]=1;
                    continue;
             }
                int count =0;
                for(int d =0;d<dir.length;d++){
                    int r = er+dir[d][0];
                    int c = ec+dir[d][1];
                    if(r>=0 && c>=0 && r<n && c<m &&grid[r][c]==0){
                       count+=dp[r][c];
                    }
                }
                dp[er][ec] = count;
                
            }
        }
        return dp[Er][Ec];
        
    }
}