class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i = 0 ; i<matrix.length;i++){
            int k = matrix[i].length-1;
            if(target<=matrix[i][k]){
                for(int j= 0 ; j<matrix[i].length;j++){
                   if(matrix[i][j]==target){
                       return true;
                   } 
                }
            }
        }
        return false;
        
    }
}