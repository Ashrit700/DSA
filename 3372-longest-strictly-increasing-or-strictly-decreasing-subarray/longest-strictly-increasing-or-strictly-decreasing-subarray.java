class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int length=1;
        int max=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[i-1]){
                length++;
                max=Math.max(max,length);
            }
            else{
                length=1;
            }
        }
        int minlength=1;
        int min=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]<nums[i-1]){
                minlength++;
                min=Math.max(min,minlength);
            }
            else{
                minlength=1;
            }
        }
        return Math.max(max,min);
        
    }
}