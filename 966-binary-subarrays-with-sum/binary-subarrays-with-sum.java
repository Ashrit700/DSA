class Solution {
    public int count(int[] nums,int goal){
        if(goal<0){
            return 0;
        }
        int c=0;
        int l=0;
        int r=0;
        int sum=0;
        while(r<nums.length){
            sum=sum+nums[r];
            while(sum>goal){
                sum=sum-nums[l];
                l++;

            }
            c=c+(r-l+1);
            r++;
        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return count(nums,goal)-count(nums,goal-1);
        
    }
}