class Solution {
    public boolean isMatch(String s, String p) {
        int m = s.length();
        int n = p.length();
        
        // dp[i][j] means s[0..i-1] matches p[0..j-1]
        boolean[][] dp = new boolean[m + 1][n + 1];
        
        // Base case 1: Empty string and empty pattern match
        dp[0][0] = true;
        
        // Base case 2: Empty string against a pattern (e.g., s="", p="a*b*")
        // We can match zero occurrences of 'a' and 'b'
        for (int j = 1; j <= n; j++) {
            if (p.charAt(j - 1) == '*') {
                dp[0][j] = dp[0][j - 2];
            }
        }
        
        // Fill the DP table
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                char sChar = s.charAt(i - 1);
                char pChar = p.charAt(j - 1);
                
                // Case 1: Characters match, or pattern has a '.'
                if (pChar == sChar || pChar == '.') {
                    dp[i][j] = dp[i - 1][j - 1];
                } 
                // Case 2: Pattern has a '*'
                else if (pChar == '*') {
                    // Option A: Use zero occurrences of the preceding character
                    dp[i][j] = dp[i][j - 2];
                    
                    // Option B: If the preceding character matches, we can use 1 or more occurrences
                    char precedingPChar = p.charAt(j - 2);
                    if (precedingPChar == sChar || precedingPChar == '.') {
                        dp[i][j] = dp[i][j] || dp[i - 1][j];
                    }
                }
            }
        }
        
        // The answer is whether the full string matches the full pattern
        return dp[m][n];
    }
}