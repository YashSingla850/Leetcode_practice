class Solution {
    boolean flag = true;
    int len =0;
    public int numEnclaves(int[][] grid) {
        int count=0;
        boolean [][] visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(visited[i][j]==false&&grid[i][j]==1){
                    flag =true;
                    len =0;
                    traverse(grid,visited,i,j);
                    if(flag==true){
                      count+=len;
                    }
                }
            }
        }
        return  count;
        
    }
    public void traverse(int [][]grid ,boolean[][]visited ,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[0].length){
            flag =false;
            
            return;
        }else if(grid[i][j]==0){
            return;
        }else if(visited[i][j]==true){
            return;
        }
        visited[i][j]=true;
        len++;
        traverse(grid,visited,i+1,j);
        traverse(grid,visited,i-1,j);
        traverse(grid,visited,i,j-1);
        traverse(grid,visited,i,j+1);
    }
}