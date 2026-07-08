class Solution {
    public double myPow(double x, int n) {
        // Step 1: Cast n to a long to avoid the Integer.MIN_VALUE overflow trap
        long N = n;
        
        // Step 2: Handle negative exponents
        // x^-n is mathematically the same as (1/x)^n
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double ans = 1.0;
        double current_product = x;
        
        // Step 3: Binary Exponentiation
        while (N > 0) {
            // If N is odd, multiply the current product into our final answer
            if (N % 2 == 1) {
                ans = ans * current_product;
            }
            // Square the base and cut the exponent in half
            current_product = current_product * current_product;
            N = N / 2;
        }
        
        return ans;
    }
}