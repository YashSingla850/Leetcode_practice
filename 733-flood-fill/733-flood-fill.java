class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        boolean[][]visited =new boolean[image.length][image[0].length];
          if(visited[sr][sc] == false){
               dfs(image , sr , sc, visited , image[sr][sc],color);
              
          }
        return image;
    }
        public  void dfs(int[][]image , int sr ,int sc , boolean[][]visited , int color1 ,int color2){
            if(sr<0||sc<0||sr>=image.length||sc>=image[0].length|| visited[sr][sc]==true|| image[sr][sc]!=color1){
                return ;
            }
            visited[sr][sc] = true;
            image[sr][sc] = color2;
            dfs(image,sr+1 , sc , visited ,color1 , color2);
            dfs(image,sr-1 , sc , visited ,color1 , color2);
            dfs(image,sr , sc+1 , visited ,color1 , color2);
            dfs(image,sr , sc-1 , visited ,color1 , color2);
        }
        
    
}