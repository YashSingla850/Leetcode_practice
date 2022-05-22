class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        //to find curr capacity, subtract rocks[i] from capacity[i];
        for(int i = 0; i < capacity.length; i++) {
            capacity[i] -= rocks[i];
        }
        
        //start distributing the additional rocks from smallest to largest to get max no of full bags
        Arrays.sort(capacity);
        int count = 0;
        for(int i = 0; i < capacity.length; i++) {
            if(capacity[i] <= additionalRocks) {
                additionalRocks -= capacity[i];
                count++;
            }
            if(additionalRocks == 0) {
                break;
            }
        }
        return count;
    }
}

// class Solution {
//     public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
//         //to find curr capacity, subtract rocks[i] from capacity[i];
//         for(int i = 0; i < capacity.length; i++) {
//             capacity[i] -= rocks[i];
//         }
        
//         //start distributing the additional rocks from smallest to largest to get max no of full bags
//         Arrays.sort(capacity);
//         int count = 0;
//         for(int i = 0; i < capacity.length; i++) {
//             if(capacity[i] <= additionalRocks) {
//                 additionalRocks -= capacity[i];
//                 count++;
//             }
//             if(additionalRocks == 0) {
//                 break;
//             }
//         }
//         return count;
//     }
// }