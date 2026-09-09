class Solution {
    public int solve(int[] arr,int k){
        int l=0;
        int r=0;
        int count=0;
        int sum=0;
        while(r<arr.length){
            sum=sum+arr[r];
            while(sum>k){
                sum=sum-arr[l];
                l++;
            }
            count=count+r-l;
            r++;
        }
        return count;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        int[] arr=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            arr[i]=nums[i]%2;
        }
        return solve(arr,k)-solve(arr,k-1);

        
    }
}