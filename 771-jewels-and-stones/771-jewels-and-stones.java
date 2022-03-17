class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashMap<Character,Integer>map = new HashMap<>();
        HashSet<Character>set = new HashSet<>();
        int ans = 0;
        for(int i= 0; i<stones.length();i++){
            char ch =stones.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
            
        }

        for(int j = 0 ; j<jewels.length();j++){
            char ch1 = jewels.charAt(j);
            set.add(ch1);
        }

        
       for(char key:map.keySet()){
           
           
           if(set.contains(key)==true){
               int freq = map.get(key);
               ans = ans+freq;
               
           }

       }
        
        return ans;
        
        
    }
}