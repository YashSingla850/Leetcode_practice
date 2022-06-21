class Solution {
    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for(int i =1;i<heights.length;i++){
            
            int diff = heights[i]-heights[i-1];
            
            if(diff>0){
                if (pq.size()<ladders){
                    
                  //  ladders--;
                    pq.offer(diff);
                }
                else{
                    
                    int br = diff;
                    if(pq.size()>0 && pq.peek()<br){
                        br = pq.remove();
                        pq.offer(diff);
                    }
                    if(bricks>=br){
                        bricks -=br;
                    }
                    else
                        return i-1; 
                }
  
            }

        }
        return heights.length-1;
        
    }
}