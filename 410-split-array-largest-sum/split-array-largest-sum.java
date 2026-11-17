class Solution {
    public int students(int val,int [] nums){
        int stu=1;
        int summation=0;
        for(int i=0;i<nums.length;i++){
            if(summation+nums[i]<=val){
                summation=summation+nums[i];

            }
            else{
                stu++;
                summation=nums[i];
            }

        }
        return stu;
    }
    public int splitArray(int[] nums, int k) {
        int max=0;
        int sum=0;

        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];

            if(max<nums[i]){
                max=nums[i];
            }
        }
        int low=max;
        int high=sum;
        while(low<=high){
            int mid=(low+high)/2;
            if(students(mid,nums)>k){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;

        
    }
}