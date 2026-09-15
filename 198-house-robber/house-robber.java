// class Solution {
//     public int amount(int [] nums,int i,int [] dp){
//         if(i>=nums.length){
//             return 0;
//         }
//         if(dp[i]!=-1){
//             return dp[i];
//         }
//         int take=nums[i]+amount(nums,i+2,dp);
//         int skip=amount(nums,i+1,dp);
//         return dp[i]=Math.max(take,skip);

//     }
//     public int rob(int[] nums) {
//         // "i vareies from 0 to n-1"
//         int [] dp=new int[nums.length];
//         Arrays.fill(dp,-1);

//         return amount(nums,0,dp);
        
//     }
// }

class Solution{
    public int rob (int[] nums){
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return kyaBe(dp,nums,0);

    }
    public int kyaBe(int[] dp,int[] nums,int i){
        if(i>=nums.length){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int take=nums[i]+kyaBe(dp,nums,i+2);
        int skip=kyaBe(dp,nums,i+1);
        return dp[i]=Math.max(take,skip);
    }
}


// Tabulation method
// we would be making an dp array of n size and storing dp[i] max upto i
// that is phle hum 0 aur 1 pr jo given numbers hai 0,1 pr vahi rakhenge then onwards
// dp[1]=Math.max(dp[0],arr[1]); 
// dp[i]=Max(arr[i]+dp[i-2],dp[i-1]);