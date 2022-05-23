class Solution {
    public boolean isValid(String s) {
        Stack<Character>st = new Stack<>();
        if(s.length()==1){
            return false;
        }
        for(int i =0;i<s.length();i++){
            // char ch = s.charAt(i);
            if(s.charAt(i) == '(' || s.charAt(i) =='{'||s.charAt(i) =='['){
                st.push(s.charAt(i));
            }else{
                  if(st.size() == 0) {
                    return false;
                }
                    if(s.charAt(i)==')'){
                        if(st.peek()=='('){
                            st.pop();
                        }else{
                            return false;
                            // break;
                        }
                    }else if(s.charAt(i)=='}'){
                        if(st.peek()=='{'){
                            st.pop();
                        }else{
                            return false;
                            // break;
                        }
                }else if(s.charAt(i)==']'){
                        if(st.peek()=='['){
                            st.pop();
                        }else{
                            return false;
                            // break;
                        }
        }
       
        
    }
}
         if(st.empty()==false){
            return false;
        }
        return true;
    }
}