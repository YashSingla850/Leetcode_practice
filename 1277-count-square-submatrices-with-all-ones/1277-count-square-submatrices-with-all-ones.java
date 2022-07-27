class Solution {
    public int countSquares(int[][] matrix) {
        int [][]dp = new int[matrix.length][matrix[0].length];
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix[0].length;j++){
                if(i==0 || j==0 ) dp[i][j] = matrix[i][j]==0?0:1;
                else{
                    if(matrix[i][j]==0)continue;
                    dp[i][j] = 1+Math.min(dp[i-1][j-1],Math.min(dp[i][j-1],dp[i-1][j]));
                }
            }
        }
        int count =0;
        for(int i =0;i<dp.length;i++){
            for(int j =0;j<dp[0].length;j++){
                count+=dp[i][j];
            }
        }
        return count;
    }
}