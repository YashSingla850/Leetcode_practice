class Solution {
    public boolean isPalindrome(String s) {
   StringBuffer sb = new StringBuffer();  
     String ss = s.toLowerCase();
        for(int i=0;i<ss.length();i++){
            char ch =ss.charAt(i);
            if(ch>='a'&&ch<='z'||ch>='0'&&ch<='9'){
                sb.append(ch);
            }
        }
        int last =sb.length()-1;
        for(int i =0;i<sb.length();i++){
            if(sb.charAt(i)!=sb.charAt(last-i)){
                return false;
            }
            
        }
       
        return true;
    }
}