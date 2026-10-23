class Solution {
    public int numDecodings(String s) {
        int n = s.length();

        if (s.charAt(0) == '0') {
            return 0;
        }

        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int f = s.charAt(i) - '0';
            int l = s.charAt(i - 1) - '0';

            // Decode the current digit individually
            if (f != 0) {
                dp[i] = dp[i - 1];
            }

            // Decode the last two digits together
            int num = l * 10 + f;

            if (num >= 10 && num <= 26) {
                if (i == 1) {
                    dp[i] += 1;
                } else {
                    dp[i] += dp[i - 2];
                }
            }
        }

        return dp[n - 1];
    }
}