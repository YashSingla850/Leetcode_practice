class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int lo= 0;
        int hi = numbers.length-1;
        int []res = new int[2];
        while(lo<=hi){
            if(numbers[lo]+numbers[hi]==target){
                res[0]=lo+1;
                res[1]= hi+1;
                return res;
            }else if(numbers[lo]+numbers[hi]>target){
                hi--;
            }else{
                lo++;
            }
        }
        return res;
        
    }
}