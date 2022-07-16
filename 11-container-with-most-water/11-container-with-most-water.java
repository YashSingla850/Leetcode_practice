class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int max = -(int)1e9;
        int j= height.length-1;
        int i =0;
          while(i<j){
              int breath = j-i;
              int length1 = Math.min(height[i],height[j]);
            int area = length1*breath;
              if(max<area){
                  max = area;
              }
              if(height[i]!=height[j]){
             int tmp1 = length1;
              if(tmp1==height[i]){
                  i++;
               }else{
                   j--;
            } 
              }else{
                  i++;
              }
          
        }
        return max;
    }
}