class Solution {
    public long check(int[] nums,int k){
        long sum=0;
        for(int i=0;i<nums.length;i++){
            sum=sum+(long)Math.ceil((double)nums[i]/k);
        }
        System.out.println(sum);
        return sum;
    }
    public int minEatingSpeed(int[] nums, int threshold) {
         int n=nums.length;
        int max=0;

        for(int i=0;i<n;i++){
            if(max<nums[i]){
                max=nums[i];
            }
        }
        System.out.println(max);

        int low=1;
        int high=max;
        int ans=-1;
        while(low<=high){
            int mid=high-(high-low)/2;
            if(check(nums,mid)<=threshold){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
        
    }
}