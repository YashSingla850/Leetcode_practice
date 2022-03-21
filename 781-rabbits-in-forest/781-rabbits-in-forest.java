class Solution {
    public int numRabbits(int[] answers) {
        HashMap<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        for(int val:answers){
         map.put(val,map.getOrDefault(val,0)+1);
        }
        for(int key:map.keySet()){
            int freq = map.get(key);
             int keys = key+1;
             int data =  (int)Math.ceil(freq*1.0/keys*1.0);
            ans +=data*keys;
            
           
        }
        return ans;
    }
}