class Solution {
 public boolean isAnagram(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    Map<Character, Integer> map = new HashMap<>();

    for (Character ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    for (Character ch : t.toCharArray()) {
      if (!map.containsKey(ch) || map.get(ch) == 0) {
        return false;
      }
      map.put(ch, map.get(ch) - 1);
    }

    return true;
  }
}
// my solution-:
// class Solution {
//     public boolean isAnagram(String s, String t) {
        
//         HashMap<Character, Integer> map1 = new HashMap<>();
//         HashMap<Character, Integer> map2 = new HashMap<>();
        
//         if(s.length() != t.length()){
//             return false;            
//         }
        
//         for(int i = 0; i < s.length(); i++){
//             if(map1.containsKey(s.charAt(i))){
//                 map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
//             }else{
//                 map1.put(s.charAt(i), 1);
//             }
            
//             if(map2.containsKey(t.charAt(i))){
//                 map2.put(t.charAt(i), map2.get(t.charAt(i))+ 1);
//             }else{
//                 map2.put(t.charAt(i), 1);
//             }
//         }
        
//          for(int i = 0; i < s.length(); i++){
//             if(map1.get(t.charAt(i)) == map2.get(t.charAt(i))){
             
//             }else{
//                 return false;
//             }
//          }
//         return true;
//     }
// }