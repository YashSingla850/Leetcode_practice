class Solution {
    public int minimumDeviation(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums)
            set.add(num);

        int min = set.last() - set.first();
        
        while (set.first() % 2 == 1) {
            set.add(set.first() * 2);
            set.remove(set.first());
            min = Math.min(min, set.last() - set.first());
        }

        while (set.last() % 2 == 0) {
            set.add(set.last() / 2);
            set.remove(set.last());
            min = Math.min(min, set.last() - set.first());
        }  
        
        
        return min;
    }
}