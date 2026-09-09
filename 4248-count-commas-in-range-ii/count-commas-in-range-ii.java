class Solution {
    public long countCommas(long n) {
        long total = 0;
        
        // For each comma group
        for (long base = 1000; base <= n; base *= 1000) {
            total += n - base + 1;
        }
        
        return total;
    }
}