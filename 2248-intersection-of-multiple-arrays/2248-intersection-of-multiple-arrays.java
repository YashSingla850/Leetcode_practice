class Solution {
    List<Integer>ans = new ArrayList<Integer>();
    public List<Integer> intersection(int[][] nums) {
        
        Map<Integer ,Integer> map = new HashMap<>();
        for (int i = 0 ;i<nums.length;i++){
            for(int j = 0;j<nums[i].length;j++){
                
                   map.put(nums[i][j] , map.getOrDefault(nums[i][j],0)+1);
                
            }
        }
        
        for(int key: map.keySet()){
            int freq = map.get(key);
            if(freq==nums.length){
                // int iInt = key;
                Integer iInteger = Integer.valueOf(key);
                ans.add(iInteger);
            }
        }
          Collections.sort(ans);
        return ans;
        
    }
}