class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        int min=Integer.MAX_VALUE;
        int max=-1;
        boolean first=false;
        while(left<=right){
            int mid=right-(right-left)/2;
            if(nums[mid]==target){
                first=true;
                min=Math.min(min,mid);
                // max=Math.max(max,mid);
                right=mid-1;


            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(!first){
             return new int[]{-1,-1};
        }
        left=0;
        right=nums.length-1;
        while(left<=right){
            int mid=right-(right-left)/2;
            if(nums[mid]==target){
                max=Math.max(max,mid);
                // max=Math.max(max,mid);
                left=mid+1;


            }
            else if(nums[mid]<target){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }
        if(max==-1){
             return new int[]{-1,-1};
        }
        return new int[]{min,max};
        
    }
}