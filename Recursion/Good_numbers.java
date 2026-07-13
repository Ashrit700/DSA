 Leetcode 1922. Count Good Numbers
 
 
 
 
 class Solution {
    public long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long even=(n+1)/2;
        long odd=n/2;
        long ans=(myPow(5,even)*myPow(4,odd))%MOD;

        return (int) ans;
        
    }
    public long myPow(int x,long n){
        if (n == 0) return 1;
        
        long res = myPow(x, n / 2);
        res = (res * res) % MOD;
        
        if (n % 2 == 1) {
            res = (res * x) % MOD;
        }
        
        return res;
    }
}