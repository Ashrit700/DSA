class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k;i++){
            sum=sum+nums[i];
        }
        int m=sum;
        for(int j=k;j<n;j++){
            sum=sum+nums[j]-nums[j-k];
            m=Math.max(m,sum);


        }
        return (double)m/k;

    }
}