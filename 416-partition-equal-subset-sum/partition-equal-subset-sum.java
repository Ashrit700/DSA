class Solution {
    public Boolean [][]dp;
    public boolean solve(int[] nums,Boolean[][] dp,int target,int ind){
        if(target==0){
            return true;
        }
        if(ind==0){
            return nums[0]==target;
        }
        if(dp[ind][target]!=null){
            return dp[ind][target];
        }
        boolean nottake=solve(nums,dp,target,ind-1);
        boolean take=false;
        if(target>=nums[ind]){
            take=solve(nums,dp,target-nums[ind],ind-1);

        }
        return dp[ind][target]=take|nottake;

    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
       if(sum%2!=0){
        return false;
       }
       int target=sum/2;
       dp=new Boolean[nums.length][target+1];
       return solve(nums,dp,sum/2,nums.length-1);
        
    }
}