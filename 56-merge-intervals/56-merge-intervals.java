class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals , (a,b)->{
          return  a[0]-b[0];
        });
        ArrayList<int[]>list = new ArrayList<>();
        
        for(int[]interval:intervals){
            if(list.size()==0){
                list.add(interval);
            }else{
            int [] last = list.get(list.size()-1);
            if(interval[0]>last[1]){
                list.add(interval);
            }else{
                last[1] = Math.max(last[1],interval[1]);
            }
        }
     }
        return list.toArray(new int[list.size()][2]);
        
    }
}


// class Solution {
//     public int[][] merge(int[][] intervals) {
//         List<int[]> res = new ArrayList<>();
//         if(intervals.length==0||intervals==null)
//             return res.toArray(new int[0][]);
//         Arrays.sort(intervals,(a,b)->a[0]-b[0]);
//         int start  = intervals[0][0];
//         int end  = intervals[0][1];
//         for(int[]i:intervals){
//             if(i[0]<=end){
//                 end = Math.max(end , i[1]);
//             }else{
//                 res.add(new int[]{start, end});
//                 start = i[0];
//                 end = i[1];
//             }
//         }
//         res.add(new int[]{start, end});
//         return res.toArray(new int[0][]);
        
//     }
// }