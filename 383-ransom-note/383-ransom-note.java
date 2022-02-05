class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
       int[] occurences = new int[26]; 
        
        for(char rChar : ransomNote.toCharArray()){
            int preIndex = occurences[rChar - 'a'];
            int index = magazine.indexOf(rChar, preIndex);
            
            if(index == -1)
                return false;
            
            occurences[rChar - 'a'] = index + 1;
        }
        
        return true;
    }
}