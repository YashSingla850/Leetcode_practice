class Solution {
    public int findMaxLength(int[] nums) {
     int ans = 0 ; 
        Map<Integer , Integer>map = new HashMap<>();
        map.put(0,-1);
        int sum =0;
        for(int i =0 ; i<nums.length ; i++){
            if(nums[i]==0){
                sum+=-1;
                
            }else if(nums[i]==1){

            sum+=1;
                
            }
            if(map.containsKey(sum)){

            int idx =map.get(sum);
                int len = i-idx;
                if(len>ans){

                    ans =len;
                }
            }
             else{
                    map.put(sum ,i);
                
            }
        }
        return ans;
        
    }
}