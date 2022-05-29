
class Solution {
    public String reverseWords(String s) {
        String [] tokens  = s.trim().split(" ");
        // system.out.print(tokens);
        Stack<String>stack = new Stack<>();
        for(String t: tokens){
            // system.out.println(t);
            // if(t==" "){
            //  continue;
            // }else{
               if(t!=""){
                   stack.push(t);
               }
                
            // }
             
        }
        StringBuilder sb = new StringBuilder();
          while(stack.size()>0){
              String ss = stack.pop();
              if(stack.size()==0){
                  sb.append(ss);
              }else{
                   sb.append(ss).append(" ");
              }
             
          }
        return  sb.toString();
    }
}