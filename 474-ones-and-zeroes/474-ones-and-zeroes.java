class Solution {
    public int findMaxForm(String[] strs, int m, int n) {
        int [][] dp = new int[m+1][n+1];
      for(String s :strs){
          int [] count = count(s);
          for(int zero = m ; zero>=count[0];zero--){
              for(int one = n; one>=count[1];one--){
                  dp[zero][one] = Math.max(dp[zero-count[0]][one-count[1]]+1, dp[zero][one]);
              }
          }
          
      }
       return dp[m][n];
    }
    
    
    int [] count(String s){
        int []count = new int[2];
        for(char c: s.toCharArray()){
            count[c-'0']++;
        }
        return count;
    }
}
// class Solution {
//     public int findMaxForm(String[] strs, int m, int n) {
//         int [][][] dp = new int[m+1][n+1][strs.length];
//         return helper(strs, m , n,0,dp);
//     }
//     public int helper(String []strs , int m0 , int n1,int index,int dp[][][]){
//         for(int idx =0;idx<=Index;idx++){
//             for(int m0 =0 , n1 =0;)
//         }
//         if(index==strs.length|| m0+n1==0){
//             return 0;
//         }
//         if(dp[m0][n1][index]!=0){
//             return dp[m0][n1][index];
//         }
//         int[]arr = count(strs[index]);
//         int cans =0;
//         if(m0>=arr[0]&&n1>=arr[1]){
//               cans = 1+helper(strs , m0-arr[0] , n1-arr[1], index+1,dp);
//         }
//         int skip=  helper(strs , m0 ,n1, index+1,dp);
//         dp[m0][n1][index] =  Math.max(cans , skip);
//         return dp[m0][n1][index];
//     }
//     int [] count(String s){
//         int []count = new int[2];
//         for(char c: s.toCharArray()){
//             count[c-'0']++;
//         }
//         return count;
//     }
// }