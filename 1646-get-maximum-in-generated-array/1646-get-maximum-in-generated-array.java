class Solution {
    public int getMaximumGenerated(int n) {
        if(n == 0)return 0;
        if(n == 1 )return 1;
        int dp [] = new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int max = Integer.MIN_VALUE;
        for(int i = 2 ; i<dp.length;i++){
            if(i%2==0){

            dp[i]= dp[i/2];
              
            }else{
                dp[i]= dp[i/2]+dp[i/2+1];
            }
              if(max<dp[i]){
                    max=dp[i];

                }

        
        }
        
            return max;
        
    }
}