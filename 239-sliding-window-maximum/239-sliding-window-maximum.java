class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int []range = new int [nums.length];
        Stack<Integer>st = new Stack<>();
        st.push(nums.length-1);
        range[nums.length-1] = nums.length;
        for(int i = nums.length-2;i>=0;i--){
            int val = nums[i];
            while(st.size()>0&&val>=nums[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                range[i] = nums.length;
            }else{
                range[i] = st.peek();
            }
            st.push(i);
        }
        int res[] = new int[nums.length-k+1];
        int j=0;
        for(int i =0;i<res.length;i++){
            if(j<i){
                j=i;
            }
            while(range[j]<=i+k-1){
                j = range[j];
            }
            res[i] = nums[j];
        }
        return res;
    }
}