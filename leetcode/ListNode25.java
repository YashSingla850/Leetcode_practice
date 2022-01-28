// class Solution {
//    Leetcode-349 intersection of two arr;
//    Mycode-
//     public int[] intersection(int[] nums1, int[] nums2) {
//         List<Integer> ans = new ArrayList<Integer>();
//         Integer arr[] = new Integer[ans.size()];
//         arr = ans.toArray(arr);
//         HashMap<Integer , Integer>ti = new HashMap<>();
//         // int []ans = new int[nums2.length]
        
//         for(int i=0; i<nums1.length;i++){
//             int n = nums1[i];
//             if(ti.containsKey(n)==false){
//                 ti.put(n,1);
//             }else{

//             int of = ti.get(n);
//                 int nf =of+1;
//                 ti.put(n,nf);
//             }
//         }
//         for(int i =0 ; i<nums2.length;i++){
//             if(ti.containsKey(nums2[i])){
//                 // ans.add(nums2[i]);
//                 System.out.print(nums2[i]);
                
                
//             }
//         }
//         return arr;
//     }
// }
//  correct code-:
//  class Solution {
//     public int[] intersection(int[] nums1, int[] nums2) {
//         HashSet<Integer>set=new HashSet<Integer>();
//         for(int i:nums1){
//             set.add(i);
            
//         }
//         HashSet<Integer>intersection=new HashSet<Integer>();
//         for(int i:nums2){
//             if(set.contains(i)){
//                 intersection.add(i);
//             }
//         }
//         int[]result = new int[intersection.size()];
//         int index = 0;
//         for(int i :intersection){
//             result[index++]=i;
            
//         }
//         return result;
        
//     }
// }