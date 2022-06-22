class Solution {
    class pair{
        int i ,j ,level;
        pair(int i ,int j ,int level){
            this.i =i;
            this.j =j;
            this.level =level;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        boolean [][] visited = new boolean[mat.length][mat[0].length];
        int [][]ans = new int [mat.length][mat[0].length];
       
        ArrayDeque<pair> q  = new ArrayDeque<>();
        for(int i =0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    q.add(new pair(i ,j ,0)); 
                }  
            }
        }
       
       
         while(q.size()>0){
             pair rem = q.remove();
             if(visited[rem.i][rem.j]==true){
                 continue;
             }
             visited[rem.i][rem.j]=true;
              ans[rem.i][rem.j] = rem.level;
             
             addc(rem.i+1 ,rem.j ,rem.level+1  ,visited,q);
              addc(rem.i-1 ,rem.j ,rem.level+1 ,visited,q);
              addc(rem.i ,rem.j-1 ,rem.level+1 ,visited,q);
              addc(rem.i ,rem.j+1 ,rem.level+1 ,visited,q);
  
         }
       return ans;
    }
          void addc( int i ,int j , int level  ,boolean[][]visited, ArrayDeque<pair>q){
         
              if(i<0 || j<0 || i>=visited.length || j>=visited[0].length || visited[i][j]==true){
                     return;
              }
              q.add(new pair(i ,j ,level));
          }
}