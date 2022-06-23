class Solution {
     class pair implements Comparable<pair>{
        int i , j,tsf;
        pair(int i , int j , int tsf){
            this.i =i;
            this.j = j;
            this.tsf = tsf;
        }
        public int compareTo(pair o){
            return this.tsf - o.tsf;
        }
    }
    public int swimInWater(int[][] grid) {
        PriorityQueue<pair>pq = new PriorityQueue<>();
        boolean[][]visited = new boolean[grid.length][grid[0].length];
                pq.add( new pair(0 ,0,grid[0][0]));
        while(pq.size()>0){
            pair rem = pq.remove();
            if(visited[rem.i][rem.j]==true){
                continue;
            }
            visited[rem.i][rem.j]=true;
            if(rem.i==grid.length-1&& rem.j==grid[0].length-1){
                return rem.tsf;
            }
            addn(rem.i+1 ,rem.j ,rem.tsf ,visited , grid , pq );
            addn(rem.i-1 ,rem.j ,rem.tsf ,visited , grid , pq );
            addn(rem.i ,rem.j+1 ,rem.tsf ,visited , grid , pq );
            addn(rem.i ,rem.j-1 ,rem.tsf ,visited , grid , pq );
        }
        return -1;
    }
    public void addn(int i ,int j,int tsf ,boolean[][] visited , int [][]grid , PriorityQueue<pair>pq){
        if(i<0 || j<0 || i>=grid.length || j>= grid[0].length||visited[i][j]==true){
            return;
        }
        pq.add(new pair(i ,j , Math.max(tsf, grid[i][j])));
    }
}