class Solution {
    public int maxArea(int[] height) {
        int length = height.length;
        int max = -(int)1e9;
        int j= height.length-1;
        int i =0;
          while(i<j){
              int breath = j-i;
            int temp = Math.min(height[i],height[j])*breath;
              if(max<temp){
                  max = temp;
              }
              if(height[i]!=height[j]){
             int tmp1 = Math.min(height[i],height[j]);
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