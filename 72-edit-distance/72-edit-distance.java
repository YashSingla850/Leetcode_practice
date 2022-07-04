class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length() , m = s2.length();
        int [][]dp = new int[n+1][m+1];
        for(int[]d:dp)Arrays.fill(d,-1);
        int ans = helper(s1, s2, n , m, dp);
        return ans;
    }
    public int helper(String s1 , String s2 , int N, int M , int [][]dp){
        for(int n = 0;n<=N ; n++){
            for(int m =0;m<=M;m++){
            if(n==0||m==0){
             dp[n][m]= n!=0?n:m;
            continue;
        }
     

        if(s1.charAt(n-1)==s2.charAt(m-1)){
                dp[n][m] = dp[n-1][m-1];
        }else{
            dp[n][m] = Math.min(Math.min(dp[n-1][m-1],dp[n-1][m]),dp[n][m-1])+1;
        }

            }
        }
        return dp[N][M];
    
    }
}



// class Solution {
//     public int minDistance(String s1, String s2) {
//         int n = s1.length() , m = s2.length();
//         int [][]dp = new int[n+1][m+1];
//         for(int[]d:dp)Arrays.fill(d,-1);
//         int ans = helper(s1, s2, n , m, dp);
//         return ans;
//     }
//     public int helper(String s1 , String s2 , int n, int m , int [][]dp){
//         if(n==0||m==0){
//             return dp[n][m]= n!=0?n:m;
//         }
//         if(dp[n][m]!=-1){
//            return dp[n][m];
//         }
        
// //         calls
//         int a = helper(s1, s2, n-1 , m-1 , dp);  // replace
//         int b = helper(s1, s2, n-1 , m , dp);     // delete
//         int c = helper(s1, s2, n , m-1 , dp);   //insert
//         if(s1.charAt(n-1)==s2.charAt(m-1)){
//                return dp[n][m] = a;
//         }else{
//             return dp[n][m] = Math.min(Math.min(a,b),c)+1;
//         }
//         // return dp[n][m];
//     }
// }