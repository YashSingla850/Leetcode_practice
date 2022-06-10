class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer>map = new HashMap<>();
        int j=0;
        int ans = 0;
        for(int i=0;i<s.length();){
            char ch  = s.charAt(i);
            if(map.containsKey(ch)==false){
                map.put(ch,1);
              ans = Math.max(ans,map.size());
                i++;
            }else{
                map.remove(s.charAt(j));
                j++;
            }
        }
        return ans;
    }
}