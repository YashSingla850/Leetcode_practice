class Solution {
    class pair{
        int i , j, time;
        pair(int i ,int j , int time){
            this.i = i ;
            this.j  = j ; 
            this.time = time ;
        }
    }
    public int orangesRotting(int[][] grid) {
        int fresh =0;
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        ArrayDeque<pair>q = new ArrayDeque<>();
        for(int i =0;i<grid.length;i++){
           for(int j =0;j<grid[0].length;j++){
               if(grid[i][j]==2){
                   q.add(new pair(i,j ,0));
               }else if(grid[i][j]==1){
                   fresh++;
               }
           }
             
        }
        int time =0;
        while(q.size()>0){
            pair rem = q.remove();
            if(visited[rem.i][rem.j]==true){
                continue;
            }
            visited[rem.i][rem.j] = true;
            if(rem.time>time){
                time = rem.time;
            }
            if(grid[rem.i][rem.j]==1){
                fresh--;
            }
                
            addn(rem.i+1 ,rem.j , rem.time+1 , visited , q,grid);
            addn(rem.i-1 ,rem.j , rem.time+1 , visited , q ,grid);
            addn(rem.i ,rem.j+1 , rem.time+1 , visited , q ,grid);
            addn(rem.i ,rem.j-1 , rem.time+1 , visited , q ,grid);

            
        }
        if(fresh!=0){
            return -1;
        }
        return time;
        
    }
     
    public void addn(int i ,int j  , int t , boolean[][]visited ,ArrayDeque<pair>q, int [][]grid){
      if(i<0 || j<0 || i>=grid.length || j>= grid[0].length || visited[i][j] ==true || grid[i][j]==0 ){
          return;
      }
        q.add(new pair( i, j ,t));
    }
}