class Solution {
    public boolean canJump(int[] nums) {
        if(nums.length==1){
            return true;
        }
         int[] dp=new int[nums.length];
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
         for(int i=0;i<nums.length;i++){
            dp[i]=sum+5;
        }
        
        dp[0]=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<=Math.min(nums.length-1,i+nums[i]);j++){
                if(j<=nums.length-1){
                dp[j]=Math.min(dp[i]+1,dp[j]);
                }
            }
        }
        // System.out.println(dp[nums.length-1]);
        boolean way=false;
        if(dp[nums.length-1]!=(sum+5)){
            way=true;
        }
        return way;
        
    }
}