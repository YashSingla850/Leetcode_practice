class Solution {
    public int findDuplicate(int[] nums) {
        Map<Integer,Integer>map = new HashMap<>();
        int ans = 0;
        for(int i = 0 ; i<nums.length;i++){
            int num  = nums[i];
            if(map.containsKey(num)==true){
                ans =num;
            }else{
                map.put(num , 1);

            
            }
            // return num;
            
        }
        
        return ans;
    }
}