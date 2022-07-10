class Solution {
    class pair{
        int i;
        int j ;
        int level;
        pair(int i , int j , int level){
            this.i = i;
            this.j = j;
            this.level = level;
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int [][]ans = new int[mat.length][mat[0].length];
        boolean [][] visited = new boolean[mat.length][mat[0].length];
        ArrayDeque<pair>queue = new ArrayDeque<>();
        for(int i = 0;i<mat.length;i++){
            for(int j =0;j<mat[0].length;j++){
                if(mat[i][j]==0){
                    queue.add(new pair(i,j,0));
                }
            }
        }
        while(queue.size()>0){
            pair rem= queue.remove();
            if(visited[rem.i][rem.j]==true){
                continue;
            }
            visited[rem.i][rem.j] = true;
            ans[rem.i][rem.j] = rem.level;
            addn(rem.i-1,rem.j , rem.level+1,visited ,queue);
            addn(rem.i,rem.j-1 , rem.level+1,visited ,queue);
            addn(rem.i,rem.j+1 , rem.level+1,visited ,queue);
            addn(rem.i+1,rem.j , rem.level+1,visited ,queue);
        }
        return ans;
    }
    void addn(int i , int j , int level , boolean[][]visited ,ArrayDeque<pair>queue){
        if(i<0||j<0||i>=visited.length||j>=visited[0].length|| visited[i][j]==true){
            return;
        }
        queue.add(new pair(i, j ,level));
    }
}