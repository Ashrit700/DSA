class Solution {
    public int jump(int[] nums) {
        int[] dp=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
         for(int i=0;i<nums.length;i++){
            dp[i]=sum;
        }
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<=i+nums[i];j++){
                if(j<=nums.length-1){
                dp[j]=Math.min(dp[i]+1,dp[j]);
                }
            }
        }
        return dp[nums.length-1];
        
        
        
    }
}