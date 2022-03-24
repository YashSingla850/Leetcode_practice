class Solution {
    public boolean wordPattern(String t, String s) {
         
         HashMap<String,Character>map = new HashMap<>();
        Set<Character>set = new HashSet<>();
        
        String[] ns = s.split(" ");
        
        int n = ns.length;
        if(t.length()!=n){
            return false;
        }
        
         for(int i = 0 ; i<t.length();i++){
            // char cs = ns.charAt(i);
            char ct = t.charAt(i);
            if(map.containsKey(ns[i])==true){
                char ch = map.get(ns[i]);
                if(ch==ct){
                    continue;
                }else{
                    return false;
                }
                
            }else{
                if(set.contains(ct)){
                   return false;
                    
                }else{
                    map.put(ns[i] ,ct);
                    set.add(ct);
                } 
            }    
         }
        return true;
        
    }
}
 