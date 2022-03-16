class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer>map = new HashMap<>();
        for(int i = 0 ; i<sentence.length();i++){
            char ch = sentence.charAt(i);
            map.put(ch , map.getOrDefault(ch,0)+1);
        }
        for(char c = 'a'  ;c<='z' ; c++){
            if(map.containsKey(c)==false){
                return false;
            }
        }
        return true;
        
    }
}