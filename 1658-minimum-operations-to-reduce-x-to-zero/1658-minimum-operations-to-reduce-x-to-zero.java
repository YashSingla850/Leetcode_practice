class Solution{
public int minOperations(int[] nums, int x) {
	int sum = 0;
	for (int num: nums) sum += num;

	int count = -1, currSum = 0;
	for (int l=0, r=0; r<nums.length; r++) {
		currSum += nums[r];
		while (l <= r && currSum > sum - x)
        {
            currSum -= nums[l++];
        }
		if (currSum == sum - x)
        {
            count = Math.max(count, r-l+1);
        }
	}

	return count == -1 ? -1 : nums.length - count;
}
}

// WRONG ANSWER-:
// class Solution {
//     public int minOperations(int[] nums, int x) {
//         int temp = x;
//         int count = 0;
//         int left= 0 , right = nums.length-1;
//         while(left<right){
//             if(temp>0){
//             if(temp>nums[left]&&temp>nums[right]){
//                 if(nums[left]>nums[right]){
//                     temp =  temp -nums[left];
//                     left++;
//                     count++;
//                 }else{
//                     temp = temp-nums[right];
//                     right--;
//                     count++;
//                 }
//             }else if(temp>nums[left]&&temp<nums[right]){
//                 temp = temp-nums[left];
//                 left++;
//                 count++;
                
//             }else if(temp>nums[right]&&temp<nums[left]){
//                 temp = temp - nums[right];
//                 right--;
//                 count++;
//             }else if(temp<nums[left]&&temp < nums[right]){
//                 count =-1;
//             }
//         }
            
//       }
//         return count;
    
//     }
// }