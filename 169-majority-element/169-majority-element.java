class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer>map= new HashMap<>();
        int n = nums.length;
        double flo = Math.floor(n/2);
        int max =0;
        int ans = 0;
        for(int key:nums){
            map.put(key,map.getOrDefault(key,0)+1);
        }
        for(int key1:map.keySet()){
            int freq = map.get(key1);
            if(freq>flo){
                max = freq;
                ans = key1;
            }
            if(freq>max){
                max =freq;
                ans= key1;
                

            }
        }
        return ans;
    }
}