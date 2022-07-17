class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer>map = new HashMap<>();
        HashSet<Integer>set = new HashSet<>();
         for(int ar:arr){
             map.put(ar , map.getOrDefault(ar,0)+1);
         }
//         iterate in hashmap
        
        for(int key : map.keySet()){
            int freq = map.get(key);
            set.add(freq);
        }
        if(set.size()==map.size())return true;
        return false;
    }
}