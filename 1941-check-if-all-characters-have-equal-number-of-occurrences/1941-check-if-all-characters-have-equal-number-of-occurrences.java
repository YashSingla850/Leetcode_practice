class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
       for(int i = 0 ; i<s.length();i++){
           char ch = s.charAt(i);

           map.put(ch , map.getOrDefault(ch,0)+1);
       }
        char ch0 = s.charAt(0);
       int x  =  map.get(ch0);
        for(int i = 1; i<s.length();i++){
            char ch1= s.charAt(i);
            if(x!=map.get(ch1)){
                return false;

            }
              
    }
            
        
  
        return true;
    }
}