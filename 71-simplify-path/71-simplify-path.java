class Solution {
    public String simplifyPath(String path) {
        String[] tokens  = path.split("/");
        Stack<String>stack = new Stack<>();
        for(String t: tokens){
            if(stack.size()>0 && "..".equals(t)){
                stack.pop();
            }else if(! Arrays.asList("",".","..").contains(t)){
                stack.push(t);
            }
        }
        StringBuilder s = new StringBuilder();
        for(String ss:stack){
            s.append("/").append(ss);
        }
        return s.length()==0?"/":s.toString();
        
    }
}


//  MY approach -:

// class Solution {
//     public String simplifyPath(String path) {
//         StringBuilder s= new StringBuilder();
//         for(int i=0;i<path.length();i++){
            
//             char ch = path.charAt(i);
//               if(ch=='/'){
//                  if(i==0||s.length()==0){
//                      s =s.append(ch);
//                  }else if(i+1<path.length()&&ch==path.charAt(i+1)){
//                      s = s.append(ch);
//                  }else{
//                      continue;
//                  }
             
//          }else if(ch=='_'){
//              continue;
             
//          }else if(ch=='.'){
//                   if(i+1<path.length()&&ch==path.charAt(i+1)){
//                      s.setLength(0);
//                   }
//              continue;
             
//          }else{
//              s = s.append(ch);
//          }
                 
        
//         }
//         String ss = s.toString();
//                  return ss;
//     }
// }