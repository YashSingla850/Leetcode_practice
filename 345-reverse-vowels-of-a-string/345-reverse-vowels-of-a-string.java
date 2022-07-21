class Solution {
    public String reverseVowels(String s) {
      String check= "aeiouAEIOU";
        StringBuilder sb = new StringBuilder(s);
        int li = 0;
        int ri = sb.length()-1;
        while(li<ri){
            while(li<ri && check.indexOf(sb.charAt(li))==-1){
                li++;
            }
              while(li<ri && check.indexOf(sb.charAt(ri))==-1){
                ri--;
            }
            char temp = sb.charAt(li);
            sb.setCharAt(li , sb.charAt(ri));
            sb.setCharAt(ri, temp);
            li++;
            ri--;
        }
        return sb.toString();
        
    }
}