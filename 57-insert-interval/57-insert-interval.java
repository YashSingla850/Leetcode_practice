class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]>list = new ArrayList<>();
        int i=0;
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            list.add(intervals[i]);
            i++;
        }
        int []interval = newInterval;
        while(i<intervals.length && intervals[i][0]<=interval[1]){
            interval[0] = Math.min(intervals[i][0] , interval[0]);
            interval[1] = Math.max(intervals[i][1] ,interval[1]);
            i++;
        }
        list.add(interval);
        while(i<intervals.length){
            list.add(intervals[i]);
            i++;
        }
        return list.toArray(new int[list.size()][2]);
    }
}