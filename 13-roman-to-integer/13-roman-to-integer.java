class Solution {
    public int romanToInt(String s) {
     HashMap<Character,Integer>map =new HashMap<>();
        
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int ans =map.get(s.charAt(s.length()-1));
       for(int i =s.length()-2;i>=0;i--){
           char ch =s.charAt(i);
           char ch1 =s.charAt(i+1); 
           int freq =map.get(ch);
           int freq1 =map.get(ch1);
           
           if(freq>=freq1){
               ans =ans+freq;
           }else{
               ans=ans-freq;
           }
           
       }
        return ans;
    }
}