class Solution {
    public int fib(int n) {
        if(n<2){
            return n;
        }
      int fn = fib(n-1)+fib(n-2);
        return fn;
   
    }
}