class Solution {
    public int numIslands(char[][] arr) {
        boolean[][]visited = new boolean[arr.length][arr[0].length];
          int count =0;
        for(int i =0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(visited[i][j] == false && arr[i][j]=='1'){
                    helper(arr, i,j,visited);
                          count++;
                }
            }
        }
        return count;
    }
    public  void helper(char[][]arr , int i,int j , boolean[][]visited){
        if(i>=arr.length||j>=arr[0].length||i<0||j<0){
            return;
        }else if(arr[i][j]=='0'){
            return;
        }else if(visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        helper(arr,i,j+1, visited);
        helper(arr,i+1,j, visited);
         helper(arr,i-1,j, visited);
         helper(arr,i,j-1, visited);
    }
}