class Solution {
    public int[] countBits(int n) {
        int bits[] = new int[n + 1];
        
        for (int i = 0; i <= n; i++) {
		
			//bitCount will return number of set bits in given number.
            bits[i] = Integer.bitCount(i);
        }
        
        return bits;
    }
}