class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        int sum=0;
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<=Math.min(nums.length-1,i+nums[i]);j++){
                if(j<=nums.length-1){
                dp[j]=Math.min(dp[i]+1,dp[j]);
                }
            }
        }
        return dp[nums.length-1];
        
        
        
    }
}