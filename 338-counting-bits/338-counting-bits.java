class Solution {
    public int[] countBits(int n) {
        int bits[] = new int[n + 1];
        bits[0] =0;
        for (int i = 1; i <= n; i++) {
		
			//bitCount will return number of set bits in given number.
            bits[i] = bits[i/2]+i%2;
        }
        
        return bits;
    }
}