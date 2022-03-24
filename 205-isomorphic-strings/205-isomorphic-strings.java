 class Solution {
     public boolean isIsomorphic(String s, String t) {
       HashMap<Character,Character>map = new HashMap<>();
        Set<Character>set = new HashSet<>();
        if(s.length()!=t.length()){
            return false;
        }
         for(int i = 0 ; i<s.length();i++){
            char cs = s.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(cs)==true){
                char ch = map.get(cs);
                if(ch==ct){
                    continue;
                }else{
                    return false;
                }
                
            }else{
                if(set.contains(ct)){
                   return false;
                    
                }else{
                    map.put(cs ,ct);
                    set.add(ct);
                } 
            }    
         }
        return true;
    }
}


// 2nd atttempt


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character,Character>map = new HashMap<>();
//         Set<Character>set = new HashSet<>();
//         if(s.length()!=t.length()){
//             return false;
//         }else if(s.length()<=1){
//             return true;

        
//         }
//         for(int i = 0 ; i<s.length();i++){
//             char cs = s.charAt(i);
//             char ct = t.charAt(i);
//             if(map.containsKey(cs)==true){
//                 char doubtvalue = map.get(cs);
//                 if(doubtvalue==ct){
//                     if(set.contains(doubtvalue)==true){
//                         for(char key:map.keySet()){
//                             char ddvalue = map.get(key);
//                             if(ddvalue==doubtvalue){
//                                 if(key==cs){
//                                     return true;
//                                 }
//                             }
                        
//                         }
//                     }
                    
//                 }
                     
//             }else{
//                 map.put(cs,ct);
//                 set.add(ct);
//              // return true;
                
//             }
//             // return true;
//         }
//         return false;
        
//     }
// }

// 1st attmept


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashMap<Character,Character>Map = new HashMap<>()
// ;
//         for(int i = 0 ;i<s.length();i++){
//             char ch = s.charAt(i);
//             char ch1 = t.charAt(i);
//             if(map.ContainsKey(ch)==true){
//                char ch10 =  map.get(ch);
//                 if(ch10!=ch1){
//                     return false;
//                 }else{

//                 map.put(ch,ch1);
//                 }
                
//             }else{
//                 map.put(ch,ch1);
//             }
//         }
//     }
// }