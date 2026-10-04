class Solution {
    public int[][] dp;
    public int solve(int amount,int[]coins,int index,int[][]dp){
        if(index==0){
            if(amount%coins[0]==0){
                return 1;
            }
            
            else {
                return 0;
            }
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int nottake=solve(amount,coins,index-1,dp);
        int take=0;
        if(amount>=coins[index]){
            take=solve(amount-coins[index],coins,index,dp);
        }
        return dp[index][amount]=take+nottake;
    }
    public int change(int amount, int[] coins) {
        dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
        return solve(amount,coins,coins.length-1,dp);
    }
}