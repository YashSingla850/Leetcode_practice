class Solution {
    public int numDecodings(String s) {
        int []dp = new int[s.length()+1];
        Arrays.fill(dp,-1);
      return  helper(s , 0 , dp);
   }
    public int helper(String s, int index , int[]dp){
        if(index==s.length())return 1;
     
        if(s.charAt(index)=='0'){
            return 0;
        }
           if(index == s.length()-1){
            return 1;
        }
        if(dp[index]!=-1)return dp[index];
         int a = helper(s, index+1 , dp);
        int b =0;
        if(Integer.parseInt(s.substring(index , index+2))<=26){
            b = helper(s , index+2 , dp);
        }
        dp[index] = a+b;
        return dp[index];
        
    }
} 