class Solution {
    public int minInsertions(String s) {
            String k=new StringBuilder(s).reverse().toString();
        int[][] dp=new int[k.length()+1][k.length()+1];
        for(int i=1;i<=k.length();i++){
            for(int j=1;j<=k.length();j++){
                if(k.charAt(i-1)==s.charAt(j-1)){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else {
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }

            }
        }
        return s.length()-dp[k.length()][k.length()];
        
    }
}