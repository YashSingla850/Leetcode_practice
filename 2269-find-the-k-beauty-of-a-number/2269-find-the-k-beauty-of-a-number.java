class Solution {
    public int divisorSubstrings(int num, int k) {
        int count =0;
        String s=String.valueOf(num);
        for(int i=0;i<=s.length()-k;i++){
            String ss = s.substring(i,i+k);
            int t  = Integer.parseInt(ss);
            
            if(t!=0&&num%t==0){

            count++;
            }
        }
        return count;
        
    }
}