class Solution {
   public int shortestPathLength(int[][] graph) {
    int n = graph.length;
    // 1: node is visited
    // 0: node is not visited
    // target state for eg if n==5 then final state is 11111
    int target = (1 << n) - 1;
    Queue<int[]> qu = new LinkedList<>();
    // for checking if particular state already occured for particular node
    boolean[][] dp = new boolean[graph.length][1 << n];
    // add each node as starting node in the queue
    for (int i = 0; i < n; i++) {
      qu.add(new int[] { i, (1 << i) });
    }
    int steps = 0;
    while (!qu.isEmpty()) {
      int size = qu.size();
      while (size-- > 0) {
        int[] curr = qu.poll();
        int node = curr[0];
        int state = curr[1];
        // if all the nodes are visited i.e target state return the no. of steps
        if (state == target) {
          return steps;
        }
        // if we have already computed the a state for a particular node then we continue
        if (dp[node][state]) {
          continue;
        }
        dp[node][state] = true;
        // else add new state in the queue
        // for eg: current state is 11001 and nei is 00010 after taking bitwise or we get 11011
        for (int nei : graph[node]) {
          qu.add(new int[] { nei, state | (1 << nei) });
        }
      }
      steps++;
    }
    return steps;
  }
}