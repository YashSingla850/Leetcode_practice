class Solution {
    public String kthDistinct(String[] arr, int k) {
           HashMap<String,Integer>map = new HashMap<>();
        
        for(int i = 0 ; i<arr.length ; i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
        }
        for(String str:arr){
            if(map.get(str)==1){
                k--;
                if(k==0){
                    return str;
                }
            }
        }
        return "";
    }
}


// class Solution {
//     public String kthDistinct(String[] arr, int k) {
//         HashMap<String,Integer>map = new HashMap<>();
        
//         for(int i = 0 ; i<arr.length ; i++){
//             map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            
//         }
     
//       int j=1; 
//         int i= 0;
//         while(i<arr.length){
//             if(map.get(arr[i])==1){
//                 if(j==k){
//                     return arr[i];
//                 }
//                 j++;
//             }
//             i++;
//         }
//         return "";
//     }
// }