class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int left=  0;
        int right = people.length-1;
        int count= 0;
        Arrays.sort(people);
        while(left<=right){
            int one =people[left];
            int two = people[right];
            if(one+two<=limit){
                count++;
                left++;
                right--;
            }else{
                count++;
                right--;
            }
        }
        return count;
    }
}