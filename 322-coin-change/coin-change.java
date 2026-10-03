class Solution {
    public int[][]dp;
    public int solve(int []coins,int index,int amount, int[][] dp){
        if(amount==0){
            return 0;
        }
        if(index==0){
            if(amount%coins[index]==0){
                return amount/coins[index];
            }
            else return Integer.MAX_VALUE;
        }
        if(dp[index][amount]!=-1){
            return dp[index][amount];
        }
        int nottake=solve(coins,index-1,amount,dp);
        int take=Integer.MAX_VALUE;
        if(amount>=coins[index]){
            int result = solve(coins, index, amount - coins[index], dp);

            if(result != Integer.MAX_VALUE){
                take = 1 + result;
            }
        }
        dp[index][amount]=Math.min(take,nottake);
        return Math.min(take,nottake);
    }
    public int coinChange(int[] coins, int amount) {
        if(amount==0){
            return 0;
        }
        dp=new int[coins.length][amount+1];
        for(int i=0;i<coins.length;i++){
            Arrays.fill(dp[i],-1);
        }
       int ans= solve(coins,coins.length-1,amount,dp);
       if(ans==Integer.MAX_VALUE){
        return -1;
       }
       else{
        return ans;
       }
        
    }
}