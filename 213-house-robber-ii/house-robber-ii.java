
class Solution{
    
    public int rob (int[] nums){
        if(nums.length==1){
            return nums[0];
        }
        if(nums==null||nums.length==0){
            return 0;
        }
        int n=nums.length;
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        int max1=kyaBe(dp,nums,0,n-2);
        int[] dp2=new int[nums.length];
        Arrays.fill(dp2,-1);
        int max2=kyaBe(dp2,nums,1,n-1);
        

        return Math.max(max1,max2);

    }
    public int kyaBe(int[] dp,int[] nums,int i,int end){
        if(i>end){
           
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+kyaBe(dp,nums,(i+2),end);
        int skip=kyaBe(dp,nums,(i+1),end);
        return dp[i]=Math.max(take,skip);
    }
}

