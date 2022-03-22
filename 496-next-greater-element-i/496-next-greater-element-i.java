class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Stack<Integer>st = new Stack<>();
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i =nums2.length-1 ;i>=0 ;i--){
            while(!st.empty()&&nums2[i]>=st.peek())
              st.pop();
                if(st.empty())
                    map.put(nums2[i],-1);
                 else
                map.put(nums2[i],st.peek());
            
                st.push(nums2[i]);
        
    }
          for(int i =0 ; i<nums1.length;i++)
            nums1[i]= map.get(nums1[i]);
        
        return nums1;  
    }
}


// import java.util.*;
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Stack<Integer> s=new Stack<Integer>();
//         HashMap<Integer,Integer> m=new HashMap<>();
         
//         for(int i=nums2.length-1;i>=0;i--){
            
//             while(!s.empty() && nums2[i]>=s.peek())
//                 s.pop();
            
//             if (s.empty())
//                 m.put(nums2[i],-1);
//             else
//                 m.put(nums2[i],s.peek());
				
//             s.push(nums2[i]);
//         }
//         for(int i=0;i<nums1.length;i++)
//             nums1[i]=m.get(nums1[i]);
     
//         return nums1;
//     }
// }
  
        