class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int []ans  = new int[n];
        int c_position = -n;
        for(int i=0;i<n;i++){
            if(s.charAt(i)==c){
                c_position = i;
            }
            ans[i] = i-c_position;
            
        }
        for(int i = n-1 ;i>=0;i--){
             if(s.charAt(i)==c){
                c_position = i;
            }
            ans[i] = Math.min(ans[i] ,Math.abs(i-c_position));
            
        }
        return ans;
        
    }
}