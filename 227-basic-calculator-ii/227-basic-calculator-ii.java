class Solution {
    public int calculate(String s) {
        Stack<Integer>st = new Stack<>();
        int n = s.length();
        char sign ='+'  ;
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(Character.isDigit(ch)){
                int val =0;
                while(i<n&&Character.isDigit(s.charAt(i))){
                     val = val*10+(s.charAt(i)-'0');
                    i++;
                }
                i--;
                if(sign =='+'){
                    st.push(val);
                }else if(sign=='-'){
                    st.push(-val);
                }else if(sign =='*'){
                    int a = st.pop();   
                    int ans = a*val;
                    st.push(ans);
                }else if(sign =='/'){
                    int a = st.pop();
                    int ans = a/val;
                    st.push(ans);
                }
                
               
            }else if(ch!=' '){
                sign = ch;
            }
        }
        int sum =0;
        while(st.size()>0) sum =sum+st.pop();
        return sum;
        
    }
}
// class Solution {
//     public int calculate(String s) {
//         int ans =0;
//      for(int i =0;i<s.length();i++){
         
//          char ch = s.charAt(i);
//          if(i+1<s.length()&&i==1){
//             if(ch == '+'){
//                ans =  s.charAt(i-1)+s.charAt(i+1);
//             }else if(ch =='-'){
//                 ans =s.charAt(i-1)-s.charAt(i+1);
//             }else if(ch=='/'){
//               ans=  s.charAt(i-1)/s.charAt(i+1);
                
//             }else if(ch =='*'){
//                 ans=s.charAt(i-1)*s.charAt(i+1);
                
//             }
             
//          }else{
//               if(ch =='+'){
//                   ans+=s.charAt(i+1);
                
//             }else if(ch =='-'){
//                 ans-=s.charAt(i+1);

                
//             }else if(ch=='/'){
//                ans/=s.charAt(i+1);

                
//             }else if(ch =='*'){
//                 ans*=s.charAt(i+1);
//             }
                 
             
             
//          }
//      }
//         return ans;
        
//     }
// }