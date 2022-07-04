class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length(), m = s2.length();
        int [][]dp = new int [n+1][m+1];
        for(int[]d : dp)Arrays.fill(d,-1);
        int ans = helper(s1 , s2, n, m, dp);
        return n+m-2*ans;
    }
    public int helper(String s1 ,String s2 , int N , int M , int [][]dp){
        for(int n =0;n<=N;n++){
            for(int m =0;m<=M;m++){
                   if(n==0||m==0){
                     dp[n][m] =0;
                       continue;
            }
        if(s1.charAt(n-1)==s2.charAt(m-1)){
              dp[n][m]= dp[n-1][m-1]+1;
        }else{
             dp[n][m] = Math.max(dp[n][m-1],dp[n-1][m]);
        }
                
            }
        }
        return dp[N][M];
     
    }
}


// class Solution {
//     public int minDistance(String s1, String s2) {
//         int n = s1.length(), m = s2.length();
//         int [][]dp = new int [n+1][m+1];
//         for(int[]d : dp)Arrays.fill(d,-1);
//         int ans = helper(s1 , s2, n, m, dp);
//         return n+m-2*ans;
//     }
//     public int helper(String s1 ,String s2 , int n , int m , int [][]dp){
//         if(n==0||m==0){
//             return dp[n][m] =0;
//         }
//         if(dp[n][m]!=-1){
//             return dp[n][m];
//         }
//         int a = helper(s1, s2, n-1, m-1,dp);
//         int b = helper(s1 , s2, n , m-1 ,dp);
//         int c = helper(s1 ,s2 , n-1, m, dp);
//         if(s1.charAt(n-1)==s2.charAt(m-1)){
//             return dp[n][m]= a+1;
//         }else{
//             return dp[n][m] = Math.max(b,c);
//         }
//     }
// }



// class Solution {
//     public int minDistance(String s1, String s2) {
//      HashMap<Character ,Integer>map1 = new HashMap<>();
//       HashMap<Character ,Integer>map2 = new HashMap<>();
//         for(int i =0;i<s1.length();i++){
//             char ch = s1.charAt(i);
//              map1.put(ch,map1.getOrDefault(ch,0)+1);
//         }
//          for(int i =0;i<s2.length();i++){
//             char ch = s2.charAt(i);
//              map2.put(ch,map2.getOrDefault(ch,0)+1);
//         }
//         for(Character key:map1.keySet()){
          
//             if(map2.containsKey(key)){
//                int freq1 = map1.get(key);
//                 int freq2 = map2.get(key);
//                 // int temp = Math.abs(freq1-freq2);
//                 if(freq1==freq2){
//                     map1.remove(key);
//                     map2.remove(key);
//                 }else if(freq1>freq2){
//                     map1.put(key,freq1-freq2);
//                     map2.remove(key);
//                 }else{
//                     map2.put(key,freq2-freq1);
//                     map1.remove(key);
//                 }
                
//             }
//         }
//         int ans = map1.size()+map2.size();
//         return ans;
        
//     }
// }


// class Solution {
    
//     public int minDistance(String word1, String word2) {
        
//         int m = word1.length();
//         int n = word2.length();
        
//         int[][] dp = new int[m+1][n+1];
        
//         for (int i=1; i<=m; i++){
            
//             for (int j=1; j<=n; j++) {
                
//                 if (word1.charAt(i-1) == word2.charAt(j-1)) {
                    
//                     dp[i][j] = 1 + dp[i-1][j-1];
                    
//                 } else {
                    
//                     dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
//                 }
//             }
//         }
        
//         return m + n - 2 * dp[m][n];
//     }
// }