class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        HashMap<Integer,Integer>map = new HashMap<>();
        ArrayList<Integer>stop = new ArrayList<>();
        for(int []ele:trips){
            int people = ele[0];
            int from = ele[1];
            int to = ele[2];
            if(map.containsKey(from)==false){
                map.put(from ,+people);
                stop.add(from);
            }else{
                map.put(from , map.get(from)+people);
            }
            
              if(map.containsKey(to)==false){
                map.put(to ,-people);
                stop.add(to);
            }else{
                map.put(to , map.get(to)-people);
            }
        }
        Collections.sort(stop);
        int size =0;
        for(int ele:stop){
           size+=map.get(ele);
            if(size>capacity){
                return false;
                // break;
            }
        }
        return true;
    }
}