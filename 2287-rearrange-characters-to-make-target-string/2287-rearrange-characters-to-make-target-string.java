class Solution {
    public int rearrangeCharacters(String s, String target) {
        HashMap<Character,Integer>map1  = new HashMap<>();
         HashMap<Character,Integer>map2  = new HashMap<>();
        int min =Integer.MAX_VALUE;
        if(s.length()<target.length()){
            min =0;
        }
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<target.length();i++){
            char ch = target.charAt(i);
            map2.put(ch, map2.getOrDefault(ch,0)+1);
        }
        for(char key:map2.keySet()){
            if(map1.containsKey(key)==false){
                 min = 0;
                break;
            
            } else if(map1.containsKey(key)==true){
                int freq = map1.get(key);
                int freq2 = map2.get(key);
                int temp  = (freq/freq2);
                min = Math.min(min,temp);     
           }

           
      }
        return min;
    }
}