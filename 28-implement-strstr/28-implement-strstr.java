class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.length()==0){
            return 0;
        }
       for(int i =0;i<haystack.length();i++){
           if(i+needle.length()>haystack.length()){
               return -1;
           }
           String str = haystack.substring(i,i+needle.length());
           if(str.equals(needle)){
               return i;
           }
           
       }
        return -1;
        
        
    }
}