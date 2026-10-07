class Solution {
    public int lengthOfLIS(int[] nums) {
        int [] result=new int[nums.length];
        int n=nums.length;
        int len=0;
        result[len]=nums[0];
        len++;
        for(int i=1;i<n;i++){
            if(nums[i]>result[len-1]){
                result[len]=nums[i];
                len++;
            }
            else{
                int left=0;
                int right=len-1;
                while(left<=right){
                    int mid=left+(right-left)/2;
                    if(result[mid]>=nums[i]){
                        right=mid-1;

                    }
                    else {
                        left=mid+1;

                    }

                }
                result[left]=nums[i];
            }
        }
        return len;
    }
}