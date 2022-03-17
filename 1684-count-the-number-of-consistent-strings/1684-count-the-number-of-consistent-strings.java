class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character>set = new HashSet<>();
        int ans=0;
        for(int i = 0; i<allowed.length();i++){

        char ch = allowed.charAt(i);
            set.add(ch);
        }
        boolean flag = false;
        for(int i =0;i<words.length;i++){
            flag = false;
            for(char ch1:words[i].toCharArray()){
          
                
          if(set.contains(ch1)==false){
                   flag = true;
                }
                

            }
            if(!flag) ans++;
           
        }
        return ans;
        
    }
}