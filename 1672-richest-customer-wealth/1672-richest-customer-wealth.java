class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = -1 , row = accounts.length , col = accounts[0].length;
        for(int i = 0 ; i<row ; i++){
            int sum = 0;
            for(int j = 0 ;j<col ; j++){
            sum = sum+accounts[i][j];
              
            }
              if(sum>max)
                    max = sum;
            // return max;
        }
        return max;
    }
}