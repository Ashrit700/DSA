class Solution {
    public int dp[][];
    // public int solve(List<Integer> nums,int target,int index,int [][] dp){
    //     if(target==0){
    //         return 0;
    //     }
    //     if(index==0){
    //         if(target==nums.get(0)){
    //             return 1;
    //         }
           
    //             return -1;
            
    //     }
    //     if(dp[index][target]!=-1){
    //         return dp[index][target];
    //     }
    //     int nottake=solve(nums,target,index-1,dp);
    //     int take=-1;
    //     if(nums.get(index)<=target){
    //         int ans=solve(nums,target-nums.get(index),index-1,dp);
    //         if(ans!=-1){
    //             take=1+ans;
    //         }
    //     }
    //     dp[index][target]=Math.max(take,nottake);
    //     return dp[index][target];
    // }
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        
        dp=new int[nums.size()][target+1];
        for(int i=0;i<nums.size();i++){
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<nums.size();i++){
           dp[i][0]=0;
        }
        if(nums.get(0)<=target){
            dp[0][nums.get(0)]=1;
        }
        for(int i=1;i<nums.size();i++){
            for(int t=1;t<=target;t++){
                int nottake=dp[i-1][t];
                int take=-1;
                if(nums.get(i)<=t){
                int ans=dp[i-1][t-nums.get(i)];
                if(ans!=-1){
                    take=1+ans;
                }
                }
                dp[i][t]=Math.max(take,nottake);
            }
        }
        return dp[nums.size()-1][target];

        
    }
}