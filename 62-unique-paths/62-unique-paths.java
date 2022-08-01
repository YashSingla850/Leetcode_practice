class Solution{
    public int uniquePaths(int n , int m){
        int [][]dp = new int [n][m];
        for(int []d:dp){
            Arrays.fill(d,-1);
        }
        int [][]dir = {{-1,0},{0,-1}};
        return helper(dp , n-1,m-1,dir);
    }
    public int helper(int [][]dp , int N, int M,int[][]dir){
        for(int n=0;n<=N;n++){
            for(int m =0;m<=M;m++){
                if(n==0 && m==0){
                    dp[n][m] =1;
                    continue;
                }
                int count =0;
                for(int d =0;d<dir.length;d++){
                    int r = n+dir[d][0];
                    int c  = m+dir[d][1];
                    if(r>=0&&c>=0&&r<dp.length&&c<dp[0].length){
                        count+= dp[r][c];
                    }
                }
                dp[n][m] = count;
            }
        }
        return dp[N][M];
    }
}

















// class Solution {
//     public int uniquePaths(int m, int n) {
//         int [][] dp = new int[n][m];
//         for(int []d:dp)Arrays.fill(d,-1);
//         return helper(dp , n-1, m-1);
//     }
//     public int helper(int [][]dp  , int n , int m){
//         if(n==0 && m==0){
//             return  1;
//         }
     
//         if(n<0 || m<0 || n>=dp.length || m>=dp[0].length){
//             return 0;
//         }
//         if(dp[n][m]!=-1)return dp[n][m];
        
//          dp[n][m]= helper(dp , n-1 , m)+helper(dp , n ,m-1);
//         return dp[n][m] ;
//     }
// }


// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dp [][] =new int [m][n];
//         int dir[][] =  {{-1,0},{0,-1}};
//         int er  = m-1 , ec = n-1;
//         int ans = helper(er , ec, dp ,dir);
//         return ans;
        
//     }
//     public int helper(int Er , int Ec,int[][]dp, int[][]dir){
//         for(int er = 0;er<=Er;er++){
//             for(int ec =0;ec<=Ec;ec++){
//                   if(er==0||ec==0){
//                  dp[er][ec]= 1;
//                       continue;
                      
//         }
        
//             int count =0;
//             for(int d =0;d<dir.length;d++){
//                 int r = er+dir[d][0];
//                 int c = ec+dir[d][1];
//                  if(r>=0 && c>=0&&r<dp.length&&c<dp[0].length){
//                      count +=dp[r][c];
//                  }
//                 }
//                  dp[er][ec] = count;
                
//             }
//         }
//         return dp[Er][Ec];
    
//     }
// }



// class Solution {
//     public int uniquePaths(int m, int n) {
//         int dp [][] =new int [m][n];
//         int dir[][] =  {{-1,0},{0,-1}};
//         int er  = m-1 , ec = n-1;
//         int ans = helper(er , ec, dp ,dir);
//         return ans;
        
//     }
//     public int helper(int er , int ec,int[][]dp, int[][]dir){
//       if(er==0||ec==0){
//           return 1;
//       }
//         if(dp[er][ec]!=0){
//             return dp[er][ec];
//         }
//         int count =0;
//         for(int d =0;d<dir.length;d++){
//             int r = er+dir[d][0];
//             int c = ec+dir[d][1];
//              if(r>=0 && c>=0&&r<dp.length&&c<dp[0].length){
//                  count +=helper(r , c, dp,dir);
//              }
//             }
//         return dp[er][ec] = count;
//     }
// }